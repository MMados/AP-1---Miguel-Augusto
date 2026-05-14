// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx5 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i=0; i < 5; i++){
            System.out.printf("Digite o %d° número do Vetor A: ", (i+1)); vetorA[i] = e.nextInt();
        }
        System.out.println("--------");
        for (int i=0; i < 5; i++){
            System.out.printf("Digite o %d° número do Vetor B: ", (i+1)); vetorB[i] = e.nextInt();
        }
        System.out.println("--------");
        for (int i=0; i < 5; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        for (int i=0; i < 5; i++){
            System.out.printf("O %d° número do vetor C é: %d\n",(i+1), vetorC[i]);
        }

        e.close();
    }
}
