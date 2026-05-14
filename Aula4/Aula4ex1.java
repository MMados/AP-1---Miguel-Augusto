// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula4ex1 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: "); int num=e.nextInt();
        switch(num) {
            case 1:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nDomingo!");
                break;
            case 2:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nSegunda!");
                break;
            case 3:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nTerça!");
                break;
            case 4:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nQuarta!");
                break;
            case 5:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nQuinta!");
                break;
            case 6:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nSexta!");
                break;
            case 7:
                System.out.printf("O dia da semana correspondente ao número digitado é:\nSábado!");
                break;
            default:
                System.out.println("O número digitado é inválido!");
        }
        e.close();
    }
}
