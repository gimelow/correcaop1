package com.p1;

public class Dupla<T> {
    private T p1;
    private T p2;

    public Dupla(T p1, T p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public T getp1(){
        return p1;
    }

    public T getp2(){
        return p2;
    }

}
