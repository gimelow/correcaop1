1. (2,5 pontos)
Sabe-se que toda moeda possui um valor e uma denominação. Suponha que está sendo desenvolvida uma parte de um sistema de carteira digital para criptomoedas.
Nesta corretora, são aceitas apenas as seguintes moedas: Bitcoin, Ethereum, Solana, Cardano e Sui.
Cada cliente, identificado pelo nome, possui várias transações, sendo que cada transação consiste em uma moeda recebida ao longo do tempo (um array de moedas).
Implemente a funcionalidade do cliente e todas as classes envolvidas, na qual seu nome e suas transações devem ser registrados, além de métodos para:
- Listar todas as transações de Bitcoin e Solana;
- Calcular o total das transações em Ethereum, Sui e Cardano (valores separados);
- Calcular o total de transações;
- Adicionar transações válidas (valores positivos);
- Mostrar todas as transações na tela.

2. (2,5 pontos)
Implemente a classe Dupla<I> que carrega dois atributos de tipo paramétrico T.
Faça um construtor e seus gets.
Crie uma classe main que possua instâncias para:
- Dupla<Integer>
- Dupla<Double>
- Dupla<String>

Mostre na tela todos os valores através dos gets.

3. (2,5 pontos)
Complete as classes abaixo e suponha estarem em arquivos distintos:
public class Calculadora {
    public static double somar(Dupla<Double> d) {
    }
    public static double subtrair(Dupla<Double> d) {
    }
    public static double multiplicar(Dupla<Double> d) {
    }
    public static double dividir(Dupla<Double> d) throws Exception {
    }
}

public class Main {
    public static void main(String[] args) {
        // Realize uma soma, uma subtração,
        // uma multiplicação e uma divisão
        // Mostre os resultados na tela
        // Feche o método e a classe
    }
}

