// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex12 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe seu salário: "); double salario=e.nextDouble();
        if (salario <=600){
            System.out.println("Você está isento!");
        }
        else if (salario >600 && salario <=1200) {
            double inss=salario*0.20;
            System.out.printf("O desconto do seu inss será de 20%% e será descontado R$%.2f \n", inss);
        }
        else if (salario >1200 && salario <=2000) {
            double inss=salario*0.25;
            System.out.printf("O desconto do seu inss será de 25%% e será descontado R$%.2f \n", inss);
        }
        else {
            double inss=salario*0.30;
            System.out.printf("O desconto do seu inss será de 30%% e será descontado R$%.2f \n", inss);
        }

        e.close();
    }
}
