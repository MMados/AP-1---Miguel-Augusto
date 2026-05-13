// Miguel Augusto De Oliveira Santos

import java.util.Scanner;

public class VetoresEx3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        String[] nomes = new String[10];
        for (int i=0; i < 5; i++){
            System.out.printf("Digite o nome da %d° pessoa: ", (i+1)); nomes[i] = e.next();
        }
        for (int i=4; i >= 0; i--){
            System.out.printf("O %s° nome é: %s\n",(i+1),nomes[i]);
        }
        System.out.println("O primeiro nome no vetor é: "+nomes[0]+" e o último é: "+nomes[4]);

        e.close();
    }
}
