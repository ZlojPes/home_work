package jv17_05.pavliuk.lesson16.generics;

import jv17_05.pavliuk.lesson11.animals.Animal;

import java.io.Serializable;

/**
 * Created by student on 11/5/2017.
 */
public class Generics<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t1;
    private V v1;
    private K k1;

    public Generics(T t1, V v1, K k1) {
        this.t1 = t1;
        this.v1 = v1;
        this.k1 = k1;
    }

    public T getT1() {
        return t1;
    }

    public V getV1() {
        return v1;
    }

    public K getK1() {
        return k1;
    }

    public void getVarTypes() {
        System.out.println("T name: " + t1.getClass().getName());
        System.out.println("V name: " + v1.getClass().getName());
        System.out.println("K name: " + k1.getClass().getName());
    }
}
