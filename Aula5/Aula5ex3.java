// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula5ex3 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int contador=1;
        System.out.println("Digite um número inteiro: "); int num=e.nextInt();
        while (num > contador) {
            System.out.println(contador);
            contador=contador*2;
        }
        e.close();
    }
}
