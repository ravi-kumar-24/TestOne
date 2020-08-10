package com.test4;


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

public class TriplateSolution {


    // Complete the triplets function below.
    static long triplets(long t, List<Integer> d) {

        Collections.sort(d);
        long result = 0;
        int n = d.size();
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (d.get(i) + d.get(j) + d.get(k) > t)
                    k--;
                else {
                    result += (k - j);
                    j++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        int dCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dTemp = new ArrayList<>();

        IntStream.range(0, dCount).forEach(i -> {
            try {
                dTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> d = dTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long res = triplets(t, d);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}