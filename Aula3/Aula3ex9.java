// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex9 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe seu salário: "); double salario=e.nextDouble();
        System.out.println("Informe o valor da prestação: "); double prestacao=e.nextDouble();
        if (prestacao > salario*0.30) {
            System.out.println("O empréstimo não pode ser concedido!");
        }
        else{
            System.out.println("O empréstimo pode ser concedido!");
        }

        e.close();
    }
}
