import java.util.Scanner;
public class Aula3desafio {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.printf("Para votar no Brasil é necessário que o indíviduo: \n *Possua mais de 16 anos(voto opcional) \n *Possua mais de 18(voto obrigatório) \n *Possua documento oficial válido com foto \n");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Informe seu nome: "); String nome=e.next();
        System.out.println("Informe sua idade: "); int idade=e.nextInt();
        System.out.printf("Você possuí documento oficial com foto?\n (1)Sim \n (2)Não\n"); int documento=e.nextInt();
        if (idade >=16 && documento==1){
            System.out.printf("Parabéns, %s! Você está apto a votar, sendo opcional seu voto!",nome);
        }
        else if (idade>18 && documento==1) {
            System.out.printf("Parabéns, %s! Você está apto a votar!",nome);
        }
        else{
            System.out.printf("Sinto muito, %s! Você não está apto a votar!",nome);
        }
        
        e.close();
    }
}

