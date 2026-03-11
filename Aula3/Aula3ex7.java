import java.util.Scanner;
public class Aula3ex7 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe seu salário: "); double salario=e.nextDouble();
        System.out.println("Informe há quantos anos você está na empresa: "); int anos=e.nextInt();
        if (anos >=5){
            double bonus=salario*0.20;
            System.out.println("O seu bônus será de: R$"+bonus);
        }
        else{
            double bonus=salario*0.10;
            System.out.println("O seu bônus será de: R$"+bonus);
        }

        e.close();
    }
}
