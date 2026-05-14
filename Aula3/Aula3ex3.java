// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex3 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: "); int num1=e.nextInt();
        System.out.println("Digite o segundo número: "); int num2=e.nextInt();
        if (num1 == num2) {
            System.out.println("Os numeros são iguais!");
        }
        else if (num1>num2) {
            int diferença=(num1-num2);
            System.out.println("A diferença entre os dois números é de: "+diferença);
        }
        else {
            int diferença=(num2-num1);
            System.out.println("A diferença entre os dois números é de: "+diferença);
        }
        e.close();
    }
}
