

package com.p1;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String nome;
    private List<Moeda> transacoes;


    public Cliente(String nome){
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }
    
    public void adicionarTransacao (Moeda moeda){
        if(moeda.valor() > 0){
            transacoes.add(moeda);
        }
        else {
            System.out.println("transacao invalida: valor da moeda deve ser maior que zero");
        }
    }

    public void listarBitcoinSolana(){
        int indiceT = 0;
        for (Moeda m : transacoes){
            if(m.denominacao() == Denominacao.BITCOIN || m.denominacao() == Denominacao.SOLANA){
                indiceT++;
                System.out.println(indiceT +": " + m.denominacao() + ": " +m.valor());
            }
        }
    }

     public void calcularEthSuiCardano(){
        double calculoEth = 0;
        double calculoSui = 0;
        double calculoCar = 0;
        for (Moeda m : transacoes){
            switch(m.denominacao()){
                case Denominacao.ETHEREUM -> calculoEth += m.valor();
                case Denominacao.SUI -> calculoSui += m.valor();
                case Denominacao.CARDANO -> calculoCar += m.valor();
            }
        }
        System.out.println("valor total das transações de ETHEREUM: " + calculoEth);
        System.out.println("valor total das transações de SUI: " + calculoSui);
        System.out.println("valor total das transações de CARDANO: " + calculoCar);
        System.out.println("valor total das transações(ETHEREUM, SUI, CARDANO): " + (calculoCar+calculoEth+calculoSui));
    }

    public void calcularTotal(){
        double total = 0;
        for (Moeda m : transacoes){
            total += m.valor();
        }

        System.out.println("valor total das transações: "+total);
    }

  public void listarTotal(){
        double total = 0;
        int indiceT = 0;
        for (Moeda m : transacoes){
                indiceT++;
                System.out.println(indiceT +": " + m.denominacao() + ": " +m.valor());
        }

        System.out.println("valor total das transações: "+total);
    }



    
}
