import java.util.Scanner;
public class Aula5ex9{
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        int resposta=1;
        int codigo;
        int quantidade;
        double valor=0,valor100=0,valor101=0,valor102=0,valor103=0,valor104=0,valor105=0;
        System.out.printf("Cardápio do dia:\n(100) Cachorro Quente ==== R$1,20\n(101) Bauru Simples ==== R$1,30\n(102) Bauru com ovo ==== R$1,50\n(103) Hambúrguer ==== R$1,20\n(104) Cheeseburguer ==== R$1,30\n(105) Refrigerante ==== R$1,00\n");
        do{
        System.out.println("Digite o código do item desejado: "); codigo=e.nextInt();
        System.out.println("Informe a quantidade desejada: "); quantidade=e.nextInt();
        switch (codigo) {
            case 100:
                valor100=valor100+(1.20*quantidade);
                break;
            case 101:
                valor101=valor101+(1.30*quantidade);
                break;
            case 102:
                valor102=valor102+(1.50*quantidade);
                break;
            case 103:
                valor103=valor103+(1.20*quantidade);
                break;
            case 104:
                valor104=valor104+(1.30*quantidade);
                break;
            case 105:
                valor105=valor105+(1.00*quantidade);
                break;
            default:
                System.out.println("O código digitado é inválido!");
                break;
        }
        System.out.printf("Deseja comprar algo mais?\n(1) Sim\n(2) Não\n");resposta=e.nextInt();
        }while(resposta==1);
        valor=valor100+valor101+valor102+valor103+valor104+valor105;
        System.out.printf("O valor total a ser pago é de: %.2f",valor);

        e.close();
    }
}