// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class FuncoesEx7 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("Digite um número: "); int numero=e.nextInt();
        int fatorial = calcularFatorial(numero);
        System.out.printf("O fatorial do número %d é: %d", numero, fatorial );
        e.close();
    }

    public static int calcularFatorial(int num){
        int multiplicador=1;
        for (int i = 1; i <= num; i++){
            multiplicador = multiplicador*i;
        }
        return multiplicador;
    }
}
