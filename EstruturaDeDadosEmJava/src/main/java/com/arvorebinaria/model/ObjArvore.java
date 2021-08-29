package com.arvorebinaria.model;

public abstract class ObjArvore<T> implements Comparable<T>{

    public abstract boolean equals(Object o);
    public abstract int hashcode();
    public abstract int compareTo(T outro);
    public abstract String toString();
}
