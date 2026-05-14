// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex4 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: "); float num1=e.nextInt();
        System.out.println("Digite o segundo número: "); float num2=e.nextInt();
        if (num1 > num2) {
            System.out.printf("A ordem decrescente desses números é: %.2f --- %.2f \n", num1, num2);
        }
        else if (num1 == num2) {
            System.out.println("Os números são iguais!");
        }
        else {
            System.out.printf("A ordem decrescente desses números é: %.2f --- %.2f \n", num2, num1);
        }
        e.close();
    }
}
