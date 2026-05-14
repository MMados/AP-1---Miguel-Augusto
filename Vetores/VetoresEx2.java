// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx2 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i=0; i < 10; i++){
            System.out.printf("Digite o %d° número: ", (i+1)); numeros[i] = e.nextInt();
        }
        for(int i=0; i < 10; i++){
            if (numeros[i] %2 == 0) {
                System.out.printf("O número %d é par!\n", numeros[i]);
            }
            else{
                System.out.printf("O número %d é ímpar!\n", numeros[i]);
            }
            
        }
        e.close();
    }
}
