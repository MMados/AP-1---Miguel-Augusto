import java.util.Scanner;
public class Aula2ex4 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");int numero1=e.nextInt();
        System.out.println("Digite o segundo número: ");int numero2=e.nextInt();
        int produto=numero1*numero2;
        System.out.println("O produto dos dois números digitados é: "+produto);
    }
}