package com.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestFailFast {

        public static void main(String[] args)
        {
           /* Map<String, String> premiumPhone = new HashMap<>();
            premiumPhone.put("Apple", "iPhone");
            premiumPhone.put("HTC", "HTC one");
            premiumPhone.put("Samsung","S5");

            Iterator iterator = premiumPhone.keySet().iterator();

            while (iterator.hasNext())
            {
                System.out.println(premiumPhone.get(iterator.next()));
                premiumPhone.put("Sony", "Xperia Z");
            }*/

            ConcurrentHashMap<String, String> chm = new ConcurrentHashMap();
            chm.put("1", "1");
            chm.put("2", "2");
            chm.put("3", "3");
            chm.put("4", "4");
            chm.put("5", "5");
            chm.put("6", "6");

            Iterator it = chm.keySet().iterator();

            while(it.hasNext()){
                String key = (String)it.next();
                System.out.println(key +" "+chm.get(key));
                chm.put("7", "7");
            }

    }
}
