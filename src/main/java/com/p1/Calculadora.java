package com.p1;

public class Calculadora {
    public static double somar(Dupla<Double> d){
        return d.getp1() + d.getp2();
    }

     public static double subtrair(Dupla<Double> d){
        return d.getp1() - d.getp2();
    }


     public static double multiplicar(Dupla<Double> d){
        return d.getp1() * d.getp2();
    }


     public static double dividir(Dupla<Double> d) throws Exception{
        if(d.getp2() == 0){
            throw new Exception("divisor não pode ser zero");
        }
        return d.getp1() / d.getp2();
    }

}
