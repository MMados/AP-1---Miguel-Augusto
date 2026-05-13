// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx6 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[7];
        int[] vetorC = new int[11];

        for (int i=0; i < 4; i++){
            System.out.printf("Digite o %d° número do Vetor A: ", (i+1)); vetorA[i] = e.nextInt();
        }
        System.out.println("--------");
        for (int i=0; i < 7; i++){
            System.out.printf("Digite o %d° número do Vetor B: ", (i+1)); vetorB[i] = e.nextInt();
        }
        System.out.println("--------");
        for (int i=0; i < 4; i++){
            vetorC[i] = vetorA[i];
        }
        for (int i=0; i < 7; i++){
            vetorC[i+4] = vetorB[i];
        }
        for (int i=0; i < 11; i++){
            System.out.printf("O %d° número do vetor C é: %d\n",(i+1), vetorC[i]);
        }

        e.close();
    }
}
