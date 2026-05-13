// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx1 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i=0; i < 10; i++){
            System.out.printf("Digite o %d° número: ", (i+1)); numeros[i] = e.nextInt();
        }
        for (int i=0; i <10; i++){
            System.out.printf("O %d° número é: %d\n", (i+1), numeros[i]);
        }
        e.close();
    }
}
