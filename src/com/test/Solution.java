package com.test;

//https://siddarthkanted.wordpress.com/2020/07/12/football-selection-application-design-arcesium/

        /*input:
        4
        5
        Boateng 6.1 22 24 45
        Kaka 6 22 1 1
        Ronaldo 5.8 21 120 0
        Suarez 5.9 20 100 1*/

      /* output
               Boateng SELECT DEFENDER
               Kaka REJECT NA
               Ronaldo SELECT STRIKER
               Saurez REJECT NA*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    enum Type {
        DEFENDER,
        STRIKER,
        NONE,
        BOTH
    }

    protected static class Player {
        public String name;
        public double height;
        public double bmi;
        public int scores;
        public int defends;
        public Type type;

        public Player(List <String> list) {
            super();

            this.name = list.get(0);
            this.height = Double.parseDouble(list.get(1));
            this.bmi = Double.parseDouble(list.get(2));
            this.scores = Integer.parseInt(list.get(3));
            this.defends = Integer.parseInt(list.get(4));
            this.type = this.getType();
        }

        private Type getType() {
            int maxBmi = 23, minGoalsScored = 50, minGoalsDefended = 30;
            double minHeight = 5.8;
            if (this.height < minHeight && this.bmi > maxBmi)
                return Type.NONE;
            if (this.scores >= minGoalsScored && this.defends >= minGoalsDefended)
                return Type.BOTH;
            if (this.scores >= minGoalsScored)
                return type.STRIKER;
            if (this.defends >= minGoalsDefended)
                return type.DEFENDER;
            return Type.NONE;
        }
    }

    /*
     * Complete the 'getSelectionStatus' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY applications as parameter.
     */

    public static List <List <String>> getSelectionStatus(List <List<String>> applications) {
        List <Player> players = applications.stream()
                .map(s -> new Player(s))
                .collect(Collectors.toList());
        Collections.sort(players, (o1, o2) -> o1.name.compareTo(o2.name));

        List < Player > defenders = players.stream().
                filter(p -> p.type == Type.DEFENDER).
                collect(Collectors.toList());

        List < Player > strikers = players.stream().
                filter(p -> p.type == Type.STRIKER).
                collect(Collectors.toList());

        List < Player > both = players.stream().
                filter(p -> p.type == Type.BOTH).
                collect(Collectors.toList());

        while (defenders.size() < strikers.size() && both.size() > 0) {
            defenders.add(both.remove(0));
        }

        while (strikers.size() < defenders.size() && both.size() > 0) {
            strikers.add(both.remove(0));
        }

        Collections.sort(defenders, (o1, o2) -> o1.defends - o2.defends);
        Collections.reverse(defenders);
        Collections.sort(strikers, (o1, o2) -> o1.scores - o2.scores);
        Collections.reverse(strikers);

        int min = Math.min(defenders.size(), strikers.size());
        Set < String > defenderName = defenders.subList(0, min).stream().map(x -> x.name).collect(Collectors.toSet());
        Set < String > strikerName = strikers.subList(0, min).stream().map(x -> x.name).collect(Collectors.toSet());

        List < List < String >> output = new ArrayList < List < String >> ();
        for (Player player: players) {
            List < String > line = new ArrayList < String > ();
            line.add(player.name);
            if (defenderName.contains(player.name)) {
                line.add("SELECT");
                line.add("DEFENDER");
            } else if (strikerName.contains(player.name)) {
                line.add("SELECT");
                line.add("STRIKER");
            } else {
                line.add("REJECT");
                line.add("NA");
            }
            output.add(line);
        }
        return output;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int applicationsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int applicationsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> applications = new ArrayList<>();

        IntStream.range(0, applicationsRows).forEach(i -> {
            try {
                applications.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<String>> result = Result.getSelectionStatus(applications);

        result.stream()
                .map(
                        r -> r.stream()
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

