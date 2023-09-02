package PrimeiraLista;

import java.util.Scanner;

public class SwitchLanchonete {
    public static void main(String[] args) {
        double  totala, totalb, totalc, totald, totale, totalf;

        int pais, vezes;

        Scanner frete = new Scanner (System.in);

        System.out.println("\nBem vindo a nossa lanchonete, o que você deseja e quanto você deseja?");

        System.out.println("\nDigite o numero do pedido, sendo [100]Cachorro Quente, [101]Bauru Simples, [102]Bauru com ovo, [103]Hamburger, [104]Cheeseburguer e [105]Refrigerante:");
        pais = frete.nextInt();

        System.out.println("\nDigite a quantidade em vezes: ");
        vezes = frete.nextInt();

        totala= vezes * 1.20;
        totalb= vezes * 1.30;
        totalc= vezes * 1.50;
        totald= vezes * 1.20;
        totale= vezes * 1.30;
        totalf= vezes * 1.00;

        switch (pais) {
            case 100:
                System.out.printf("\nO valor total eh %.2f\n", totala);
                break;
            case 101:
                System.out.printf("\nO valor total eh %.2f\n", totalb);
            break;
            case 102:
                System.out.printf("\nO valor total eh %.2f\n", totalc);
            break;
            case 103:
                System.out.printf("\nO valor total eh %.2f\n", totald);
            break;
            case 104:
                System.out.printf("\nO valor total eh %.2f\n", totale);
            break;
            case 105:
                System.out.printf("\nO valor total eh %.2f\n", totalf);
            break;
            default:
                System.out.println("\nError. O número do pedido digitado nao existe.");
                break;
        }
       frete.close();
       System.out.println("\nPrograma Finalizado");
    }
}
