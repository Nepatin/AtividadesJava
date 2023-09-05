package PrimeiraLista;

import java.util.Scanner;

public class SwitchFrete {
    public static void main(String[] args) {
        float produto;

        double totala, totalb, totalc, totald, totale;

        int pais;

        Scanner frete = new Scanner (System.in);

        System.out.println("Ola, bem vindo!\nVamos imaginar o seguinte dilema: voce esta interessado em comprar um produto do exterior e deseja saber o valor total do produto junto com o frete.\nEsse programa ira auxiliar voce!");

        System.out.println("\nDigite o valor do seu produto: ");
        produto = frete.nextFloat();

        System.out.println("\nDigite o numero do pais sendo [1]EUA, [2]Franca, [3]Mexico, [4]Argentina e [5]China, no qual voce deseja comprar: ");
        pais = frete.nextInt();

        totala= produto + 60.00;
        totalb= produto + 75.50;
        totalc= produto + 50.00;
        totald= produto + 27.35;
        totale= produto + 80.00;

        switch (pais) {
            case 1:
                System.out.printf("\nO valor total eh %.2f de acordo com o frete dos Estados Unidos\n", totala);
                break;
            case 2:
                System.out.printf("\nO valor total eh %.2f de acordo com o frete da Franca\n", totalb);
            break;
            case 3:
                System.out.printf("\nO valor total eh %.2f de acordo com o frete do Mexico\n", totalc);
            break;
            case 4:
                System.out.printf("\nO valor total eh %.2f de acordo com o frete da Argentina\n", totald);
            break;
            case 5:
                System.out.printf("\nO valor total eh %.2f de acordo com o frete da China\n", totale);
            break;
            default:
                System.out.println("\nNao existe numero para esse pais");
                break;
        }
       frete.close();
       System.out.println("\nPrograma Finalizado");
    }
}
