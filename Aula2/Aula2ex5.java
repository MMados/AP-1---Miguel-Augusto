import java.util.Scanner;
public class Aula2ex5 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");int numero1=e.nextInt();
        System.out.println("Digite o segundo número: ");int numero2=e.nextInt();
        System.out.println("Digite o terceiro número: ");int numero3=e.nextInt();
        System.out.println("Digite o quarto número: ");int numero4=e.nextInt();
        int soma=numero1+numero2+numero3+numero4;
        System.out.println("A soma de todos os numeros digitados é: "+soma);
    }
}