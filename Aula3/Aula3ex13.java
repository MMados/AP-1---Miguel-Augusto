import java.util.Scanner;
public class Aula3ex13 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o primeiro número: "); double num1=e.nextDouble();
        System.out.println("Digite o segundo número: "); double num2=e.nextDouble();
        System.out.println("Digite o sinal da operação desejada: "); char sinal=e.next().charAt(0);
        double soma=num1+num2;
        double subtracao=num1-num2;
        double multiplicacao=num1*num2;
        double divisao=num1/num2;
        if (sinal=='+'){
            System.out.println(soma);
        }
        else if (sinal=='-') {
            System.out.println(subtracao);
        }
        else if (sinal=='*') {
            System.out.println(multiplicacao);
        }
        else if (sinal=='/') {
            if (num2>0)
            System.out.println(divisao);
            else{
                System.out.println("Impossível dividir!");
            }
        }
        else{
            System.out.println("Sinal inválido!");
        }
    

        e.close();
    }
}
