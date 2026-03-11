import java.util.Scanner;
public class Aula3ex6 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe sua altura em centímetros: "); double altura=e.nextDouble();
        System.out.printf("Informe seu sexo: \n (1) Masculino \n (2) Feminino \n"); int sexo=e.nextInt();
        if (sexo == 1){
            double pesoideal=72.7 + 0.75 * (altura - 152.4);
            System.out.println("O peso ideal para esta pessoa é: "+pesoideal+" kg");
        }
        else if (sexo == 2) {
            double pesoideal=52 + 0.75 * (altura - 152.4);
            System.out.println("O peso ideal para esta pessoa é: "+pesoideal+" kg");
        }
        else{
            System.out.println("Número inválido!");
        }
        e.close();
    }
}
