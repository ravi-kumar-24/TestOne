package com.test1;

import java.io.Serializable;

// Double Checked Locking based Java implementation of
// singleton design pattern
class Singleton implements Cloneable, Serializable
{
    private volatile static Singleton obj;

    private Singleton() throws RuntimeException
    {
        if(obj!=null){
            throw new RuntimeException(); // to handle the reflections
        }
    }
    // implement readResolve method
    protected Object readResolve()
    {
        return obj;
    }
    public static Singleton getInstance()
    {
        if (obj == null) // first check if instance already created than no need to going in synchronized block
        {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null) {
                        obj = new Singleton();
                }
            }
        }
        return obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
}

