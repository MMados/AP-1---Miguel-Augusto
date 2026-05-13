// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class FuncoesEx3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: "); int numero1 = e.nextInt();
        System.out.println("Digite o segundo número: "); int numero2 = e.nextInt();
        int maiorNumero = encontrarMax(numero1, numero2);
        System.out.println("O maior número é: "+maiorNumero);
        e.close();
    }

    public static int encontrarMax(int num1, int num2) {
        if (num1 > num2){
            return num1; 
        }
        else{
            return num2;
        }
    }
}
