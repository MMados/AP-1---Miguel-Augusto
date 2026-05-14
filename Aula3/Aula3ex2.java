// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex2 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe sua idade: "); int idade=e.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
        e.close();
    }
}
