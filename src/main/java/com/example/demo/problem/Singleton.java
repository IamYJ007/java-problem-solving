package com.example.demo.problem;

import java.util.Objects;

// Final class
public final class Singleton implements Cloneable {

    // private static volatile instance
    private static volatile Singleton instance = null;

    // private constructor
    private Singleton() {
        // protect from reflection
        if (instance != null) {
            throw new InstantiationError("Creating of this object is not allowed.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double check
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // protect from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // protect from deserializing
    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton s = new Singleton();
        Singleton s1 = new Singleton();

        if (Objects.equals(s, s1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
