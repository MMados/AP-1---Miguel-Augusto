// Miguel Augusto De Oliveira Santos

import java.util.Scanner;
public class Aula3ex8 {
    public static void main( String [] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite a senha: "); String senha=e.next();
        if (senha.equals("R10p5")){
            System.out.println("Acesso Concedido!");
        }
        else{
            System.out.println("Acesso negado!");
        }

        e.close();
    }
}
