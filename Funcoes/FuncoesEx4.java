// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class FuncoesEx4 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int numero;
        boolean repeticao=false;
        while (repeticao == false) {
            System.out.println("Digite um número inteiro ou 0 para sair: "); numero=e.nextInt();
            if (numero == 0) {
                System.out.println("Saindo");
                repeticao = true;
            }
            else if (isPar(numero)){
                System.out.println("O número é par!\n");
            }
            else{
                System.out.println("O número é ímpar!\n");
            }
        }
        e.close();
    }

    public static boolean isPar(int num){
        return num % 2 == 0;
    }
}
