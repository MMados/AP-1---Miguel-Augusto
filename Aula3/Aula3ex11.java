// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex11 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite sua idade: "); int idade=e.nextInt();
        if (idade >=5 && idade <=7){
            System.out.println("Sua categoria é: Infantil A");
        }
        else if(idade >=8 && idade <=10){
            System.out.println("Sua categoria é: Infantil B");
        }
        else if(idade >=11 && idade <=13){
            System.out.println("Sua categoria é: Juvenil A");
        }
        else if(idade >=14 && idade <=17){
            System.out.println("Sua categoria é: Juvenil B");
        }
        else if(idade >=18){
            System.out.println("Sua categoria é: Sênior");
        }
        else{
            System.out.println("Sua idade é inválida para alguma categoria!");
        }

        e.close();
    }
}
