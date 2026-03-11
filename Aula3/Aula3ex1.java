import java.util.Scanner;
public class Aula3ex1 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite um número inteiro: "); int num=e.nextInt();
        if (num > 20) {
            double metade=num/2.0;
            System.out.printf("A metade de %d é: %.2f", num, metade);
        }
        e.close();
    }
}
