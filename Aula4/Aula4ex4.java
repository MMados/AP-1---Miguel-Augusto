import java.util.Scanner;
public class Aula4ex4 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe seu salário: "); double salarioatual=e.nextDouble();
        System.out.printf("Informe seu plano de trabalho atual:\n(A)\n(B)\n(C)\n"); String plano=e.next();
        switch (plano) {
            case "A":
                double salarionovoa=salarioatual+(salarioatual*0.10);
                System.out.printf("Seu novo salário será: R$%.2f",salarionovoa);
                break;
            case "B":
                double salarionovob=salarioatual+(salarioatual*0.15);
                System.out.printf("Seu novo salário será: R$%.2f",salarionovob);
                break;
            case "C":
                double salarionovoc=salarioatual+(salarioatual*0.20);
                System.out.printf("Seu novo salário será: R$%.2f",salarionovoc);
                break;
            default:
                System.out.println("Plano de trabalho inválido!");
                break;
        }
        e.close();
    }
}
