

package com.p1;


public class Correcaop1 {

    public static void main(String[] args) {
        //exercicio 1
    //    Moeda m1 = new Moeda(Denominacao.BITCOIN, 1.0);
    //    Moeda m2 = new Moeda(Denominacao.ETHEREUM, 2.0);
    //    Moeda m3 = new Moeda(Denominacao.SOLANA, 3.0);
    //    Moeda m4 = new Moeda(Denominacao.SUI, 4.0);
    //    Moeda m5 = new Moeda(Denominacao.CARDANO, 5.0);
    //    Moeda m6 = new Moeda(Denominacao.BITCOIN, 2.0);
    //    Moeda m7 = new Moeda(Denominacao.ETHEREUM, 3.0);


    //    Cliente c1 = new Cliente("giovanna");
    //    c1.adicionarTransacao(m1);
    //    c1.adicionarTransacao(m2);
    //    c1.adicionarTransacao(m3);
    //    c1.adicionarTransacao(m4);
    //    c1.adicionarTransacao(m5);
    //    c1.adicionarTransacao(m6);
    //    c1.adicionarTransacao(m7);

    //     c1.listarBitcoinSolana();
    //     c1.calcularEthSuiCardano();
    //     c1.calcularTotal();
    //     c1.listarTotal();

        // // exercicio 2
         Dupla<Double> doublesDupla = new Dupla<>(10.0, 2.0);
        // Dupla<Integer> integerDupla = new Dupla<>(20, 30);
        // Dupla<String> stringsDupla = new Dupla<>("a","b");


        // System.out.println("valores");
        // System.out.println("dupla de doubles: " + doublesDupla.getp1() + " e " + doublesDupla.getp2());
        // System.out.println("dupla de ints: " + integerDupla.getp1() + " e " + integerDupla.getp2());
        // System.out.println("dupla de strings: " + stringsDupla.getp1() + " e " + stringsDupla.getp2());


        //exercicio 3
        System.out.println("soma: " + Calculadora.somar(doublesDupla));
        System.out.println("subt: " + Calculadora.subtrair(doublesDupla));
        System.out.println("mult: " + Calculadora.multiplicar(doublesDupla));
        try {
            System.out.println("dividir: " + Calculadora.dividir(doublesDupla));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
