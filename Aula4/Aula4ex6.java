import java.util.Scanner;
public class Aula4ex6 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.printf("Cardápio do dia:\n(100) Cachorro Quente ==== R$1,20\n(101) Bauru Simples ==== R$1,30\n(102) Bauru com ovo ==== R$1,50\n(103) Hambúrguer ==== R$1,20\n(104) Cheeseburguer ==== R$1,30\n(105) Refrigerante ==== R$1,00\n");
        System.out.println("Digite o código do item desejado: "); int codigo=e.nextInt();
        System.out.println("Informe a quantidade desejada: "); int quantidade=e.nextInt();
        switch (codigo) {
            case 100:
                double valor100=1.20*quantidade;
                System.out.println("========Cachorro Quente========");
                System.out.printf("O preço a ser pago por %d Cachorros Quentes é de: R$%.2f",quantidade,valor100);
                break;
            case 101:
                double valor101=1.30*quantidade;
                System.out.println("========Bauru Simples========");
                System.out.printf("O preço a ser pago por %d Baurus Simples é de: R$%.2f",quantidade,valor101);
                break;
            case 102:
                double valor102=1.50*quantidade;
                System.out.println("========Bauru com ovo========");
                System.out.printf("O preço a ser pago por %d Baurus com Ovo é de: R$%.2f",quantidade,valor102);
                break;
            case 103:
                double valor103=1.20*quantidade;
                System.out.println("========Hambúrguer========");
                System.out.printf("O preço a ser pago por %d Hambúrgueres é de: R$%.2f",quantidade,valor103);
                break;
            case 104:
                double valor104=1.30*quantidade;
                System.out.println("========Cheeseburguer========");
                System.out.printf("O preço a ser pago por %d Cheeseburgueres é de: R$%.2f",quantidade,valor104);
                break;
            case 105:
                double valor105=1.00*quantidade;
                System.out.println("========Refrigerante========");
                System.out.printf("O preço a ser pago por %d Refrigerantes é de: R$%.2f",quantidade,valor105);
                break;
            default:
                System.out.println("O código digitado é inválido!");
                break;
        }
        e.close();
    }
}
