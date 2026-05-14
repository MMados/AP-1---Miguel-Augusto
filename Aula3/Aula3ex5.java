// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex5 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);  
        System.out.println("Digite um número inteiro: "); int num=e.nextInt();
        if (num >= 50 && num <= 100) {
            System.out.println("O número pertence ao intervalo!");
        }
        else{
            System.out.println("O número não pertence ao intervalo!");
        }
        e.close();
    }
}
