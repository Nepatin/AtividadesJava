package SegundaLista.SegundaLista.SegundaLista;

import java.util.Scanner;

public class KmouMs {
    public static void main(String[] args) {
        
        float num, c;
        int a, b = 0;

        Scanner input = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa.\nIrei fazer a conversao de Km/h para M/s ou vice-versa.");

        do {
            System.out.println("Digite a velocidade:");
            num = input.nextFloat();

            System.out.println("Para converter Km/h para M/s digite 1\nPara converter M/s para Km/h digite 2");
            a = input.nextInt();

            if(num == 0 || a == 2) {
                c = (float) (num * 3.6);
                System.out.printf("A conversao de %.2fM/s para Km/h eh %.2f\n", num, c);

                System.out.println("Para sair digite -1, para repetir novamente digite 3");
                b = input.nextInt();
                
            } else if (num == 0 || a == 1 ) {
                c = (float) (num / 3.6);

                System.out.printf("A conversao de %.2f Km/h para M/s eh %.2f\n", num, c);

                System.out.println("Para sair digite -1, para repetir novamente digite 3");
                b = input.nextInt();
            }
        } while (b != -1);
        input.close();
    }
}