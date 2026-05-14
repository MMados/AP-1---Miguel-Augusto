// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx4 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i=0; i < 5; i++){
            System.out.printf("Digite o %d° número do Vetor A: ", (i+1)); vetorA[i] = e.nextInt();
        }
        for (int i=0; i < 5; i++){
            vetorB[i] = vetorA[i] * 3;
        }
        for (int i=0; i < 5; i++){
            System.out.printf("O %d° número do vetor B é: %d\n",(i+1), vetorB[i]);
        }
        e.close();
    }
}
