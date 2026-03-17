import java.util.Scanner;
public class Aula4ex3 {
    public static void main(String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Informe seu nome: "); String nome=e.next();
        System.out.printf("Digite a qual período você pertence:\n(M) Matutino\n(V) Vespertino\n(N) Noturno\n"); String periodo=e.next();
        switch (periodo) {
            case "M":
                System.out.printf("Bom dia, %s!",nome);
                break;
            case "V":
                System.out.printf("Boa Tarde, %s!",nome);
                break;
            case "N":
                System.out.printf("Boa noite, %s!",nome);
                break;
            default:
                System.out.printf("Período digitado inválido, %s!",nome);
                break;
        }
        e.close();
    }
}
