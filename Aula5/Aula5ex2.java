import java.util.Scanner;
public class Aula5ex2 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int contador=1;
        int par=0;
        int impar=0;
        while (contador <= 10) {
            System.out.println("Digite o "+contador+"° número inteiro: "); int num=e.nextInt();
            contador++;
            double resto=num%2;
            if (resto==0) {
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.printf("A quantidade de números pares é: %d\nA quantidade de números ímpares é: %d",par,impar);

        e.close();

    }
}
