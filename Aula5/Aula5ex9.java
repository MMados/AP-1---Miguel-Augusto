// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula5ex9{
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int resposta=1;
        int codigo;
        int quantidade,quantidade100=0,quantidade101=0,quantidade102=0,quantidade103=0,quantidade104=0,quantidade105=0;
        String comprafinal="", valorformatado;
        double valor=0,valor100=0,valor101=0,valor102=0,valor103=0,valor104=0,valor105=0;
        do{
        System.out.printf("Cardápio do dia:\n(100) Cachorro Quente ==== R$1,20\n(101) Bauru Simples ==== R$1,30\n(102) Bauru com ovo ==== R$1,50\n(103) Hambúrguer ==== R$1,20\n(104) Cheeseburguer ==== R$1,30\n(105) Refrigerante ==== R$1,00\n");
        System.out.println("\nDigite o código do item desejado: "); codigo=e.nextInt();
        System.out.println("Informe a quantidade desejada: "); quantidade=e.nextInt();
        switch (codigo) {
            case 100:
                quantidade100=quantidade;
                valor100=valor100+(1.20*quantidade100);
                break;
            case 101:
                quantidade101=quantidade;
                valor101=valor101+(1.30*quantidade101);
                break;
            case 102:
                quantidade102=quantidade;
                valor102=valor102+(1.50*quantidade102);
                break;
            case 103:
                quantidade103=quantidade;
                valor103=valor103+(1.20*quantidade103);
                break;
            case 104:
                quantidade104=quantidade;
                valor104=valor104+(1.30*quantidade104);
                break;
            case 105:
                quantidade105=quantidade;
                valor105=valor105+(1.00*quantidade105);
                break;
            default:
                System.out.println("O código digitado é inválido!");
                break;
        }
        System.out.printf("Deseja comprar algo mais?\n(1) Sim\n(2) Não\n");resposta=e.nextInt();
        }while(resposta==1);
        if (valor100 != 0) {
            valorformatado=String.format("%.2f", valor100);
            comprafinal += +quantidade100+" Cachorros Quentes: R$"+valorformatado+"\n";
        }
        if (valor101 != 0) {
            valorformatado=String.format("%.2f", valor101);
            comprafinal += +quantidade101+" Bauru Simples: R$"+valorformatado+"\n";
        }
        if (valor102 != 0) {
            valorformatado=String.format("%.2f", valor102);
            comprafinal += +quantidade102+" Baurus com Ovos: R$"+valorformatado+"\n";
        }
        if (valor103 != 0) {
            valorformatado=String.format("%.2f", valor103);
            comprafinal += +quantidade103+" Hambúrgueres: R$"+valorformatado+"\n";
        }
        if (valor104 != 0) {
            valorformatado=String.format("%.2f", valor104);
            comprafinal += +quantidade104+" Cheeseburgueres: R$"+valorformatado+"\n";
        }
        if (valor105 != 0) {
            valorformatado=String.format("%.2f", valor105);
            comprafinal += +quantidade105+" Refrigerantes: R$"+valorformatado+"\n";
        }
        valor=valor100+valor101+valor102+valor103+valor104+valor105;
        System.out.printf("Sua compra é: \n"+comprafinal+"\nValor total da compra: R$"+valor);
        e.close();
    }
}