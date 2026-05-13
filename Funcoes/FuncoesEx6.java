// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class FuncoesEx6{
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um número: ");
            numeros[i] = e.nextInt();
        }
        System.out.println("Maior valor: " + maiorValor(numeros));
        System.out.println("Menor valor: " + menorValor(numeros));
        System.out.println("Média entre max e min: " + mediaMaxMin(numeros));

        e.close();
    }

    // (a) Função que retorna o maior valor do vetor
    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    // (b) Função que retorna o menor valor do vetor
    public static int menorValor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    // (c) Função que retorna (max + min) / 2
    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);

        return (max + min) / 2.0;
    }
}