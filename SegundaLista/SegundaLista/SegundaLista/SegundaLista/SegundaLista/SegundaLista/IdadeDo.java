package SegundaLista.SegundaLista.SegundaLista;

import java.util.Scanner;

public class IdadeDo {
    public static void main(String[] args) {

        int ida = 0, mais = 0;
        float som = 0, med = 0;
  
        Scanner input = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa. Irei dar o resultado da media das idades digitadas.\n");
        System.out.println("Caso queira sair do programa e a media seja impressa digite 0\n");
        System.out.println("Digite as idades.\n");

        do {
            ida= input.nextInt();
                if(ida != 0){
                    som += ida;
                    mais++;
                }
        } while (ida != 0);

        med = som / mais;
        System.out.printf("\nMedia das idades eh %.2f", med);
        input.close();
    }
}