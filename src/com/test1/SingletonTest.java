package com.test1;

import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Singleton  sing = Singleton.getInstance();
        Singleton  sing2 = Singleton.getInstance();
        Singleton  sing3 = Singleton.getInstance();
        Singleton    instance2 = null;
        System.out.println(sing);
        System.out.println(sing2);
        System.out.println(sing3);

        try
        {
            Constructor[] constructors =
                    Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                  instance2 = (Singleton) constructor.newInstance();
                break;
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(instance2);


    }
}

