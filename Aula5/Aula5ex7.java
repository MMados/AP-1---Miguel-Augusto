import java.util.Scanner;
public class Aula5ex7 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int contador=1;
        double altura;
        double peso;
        double imc;
        int pessoascompesoideal=0;
        while (contador<=10) {
            System.out.printf("====Pessoa %d====\n",contador);
            System.out.println("Digite sua altura (Utilize virgula): "); altura=e.nextDouble();
            System.out.println("Digite seu peso (Utilize virgula): "); peso=e.nextDouble();
            imc=peso/(altura*altura);
            if (imc >=18.5 && imc <=24.9) {
                pessoascompesoideal++;
            }
            contador++;
        }
        System.out.printf("O número de pessoas que estão no peso ideal é: %d",pessoascompesoideal);

        e.close();
    }
}
