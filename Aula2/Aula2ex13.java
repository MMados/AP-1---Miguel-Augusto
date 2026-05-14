// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula2ex13 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite um número qualquer: "); double num =e.nextDouble();
        double quadrado=num*num;
        double cubo=num*num*num;
        double raiz=Math.sqrt(num);
        double potencia=Math.pow(num, 10);
        System.out.println("O quadrado deste numero é: "+quadrado);
        System.out.println("O cubo deste numero é: "+cubo);
        System.out.println("A raiz quadrada deste numero é: "+raiz);
        System.out.println("Este numero elevado a decima potencia é: "+potencia);
        e.close();
    }
}
