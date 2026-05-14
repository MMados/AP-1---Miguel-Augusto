// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class Aula5ex8 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int contador=1;
        double nota1, nota2;
        while (contador <=5) {
            do{
                System.out.println("Digite a primeira nota: "); nota1=e.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida!");
                }
            } while(nota1 < 0 && nota1 > 10);

            do{
                System.out.println("Digite a segunda nota: "); nota2=e.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida!");
                }
            } while(nota1 < 0 && nota1 > 10);

            double media=(nota1+nota2)/2;
            System.out.println("Sua média aritimetica é: "+media);
            contador++;
            }
        e.close();
    }
}
