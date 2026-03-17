import java.util.Scanner;
public class Aula4ex5 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.printf("Escolha o que deseja:\n(M) Média entre os números digitados\n(S) Diferença do maior pelo menor\n(P) Produto entre os números digitados\n(D) Divisão do primeiro pelo segundo\n");
        String operacao=e.next();
        System.out.println("Digite o primeiro número: "); double num1=e.nextDouble();
        System.out.println("Digite o segundo número: "); double num2=e.nextDouble();
        switch (operacao) {
            case "M":
                double media=(num1+num2)/2.0;
                System.out.println("========Média========");
                System.out.printf("A média entre %.2f e %.2f é: %.2f",num1,num2,media);
                break;
            case "S":
                System.out.println("========Diferença========");
                if (num1>num2){
                    double num1M=num1-num2;
                    System.out.printf("A diferença de %.2f para %.2f é de: %.2f",num1,num2,num1M);
                }
                else if(num2>num1){
                    double num2M=num2-num1;
                    System.out.printf("A diferença de %.2f para %.2f é de: %.2f",num2,num1,num2M);
                }
                else{
                    System.out.println("Os números digitados são iguais!");
                }
                break;
            case "P":
                System.out.println("========Produto========");
                double produto=num1*num2;
                System.out.printf("O produto entre %.2f e %.2f é: %.2f",num1,num2,produto);
                break;
            case "D":
                System.out.println("========Divisão========");
                double divisao=num1/num2;
                System.out.printf("A divisão de %.2f por %.2f é: %.2f",num1,num2,divisao);
                break;
            default:
                System.out.println("A operação digitada é inválida!");
                break;
        }
        e.close();
    }
}
