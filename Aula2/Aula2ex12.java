// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula2ex12 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: "); int anonascimento =e.nextInt();
        System.out.println("Digite o ano atual: "); int anoatual =e.nextInt();
        int idade=anoatual-anonascimento;
        int idadefutura=2030-anonascimento;
        System.out.println("Sua idade atual é: "+idade+ " anos");
        System.out.println("Sua idade em 2030 será de: "+idadefutura+" anos");
        e.close();
    }
}
