// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula2ex6 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");double nota1=e.nextDouble();
        System.out.println("Digite a segunda nota: ");double nota2=e.nextDouble();
        System.out.println("Digite a terceira nota: ");double nota3=e.nextDouble();
        double media=(nota1+nota2+nota3)/3;
        System.out.printf("A média aritimética deste aluno é: %.2f.%n",media);
        e.close();
    }
}
