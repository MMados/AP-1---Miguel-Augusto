// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class FuncoesEx5 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: "); int numero=e.nextInt();
        String dia=exibirDiaSemana(numero);
        System.out.println(dia);
        e.close();
    }

    public static String exibirDiaSemana(int num){
        switch (num) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
               return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }

}
