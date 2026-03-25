import java.util.Scanner;
public class Aula5ex6 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int num;
        int menor;
        int contador=1;
        while (contador<=10) {
            System.out.println("Digite o "+contador+"° número inteiro: "); num=e.nextInt();
            contador++;

        }
    }
}