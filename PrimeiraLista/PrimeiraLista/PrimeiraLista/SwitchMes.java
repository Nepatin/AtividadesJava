package PrimeiraLista;

import java.util.Scanner;

public class SwitchMes {
    public static void main(String[] args) {
        int mes;

        Scanner qnd = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa. Irei imprimir o mes que for digitado. 1 para Janeiro ate 12 Dezembro.");

        System.out.println("Digite o numero do mes desejado: ");
        mes = qnd.nextInt();

        switch (mes) {
            case 1:
                System.out.println("O mes eh Janeiro");
                break;
            case 2:
                System.out.println("O mes eh Fevereiro");
                break;
            case 3:
                System.out.println("O mes eh Marco");
                break;
            case 4:
                System.out.println("O mes eh Abril");
                break;
            case 5:
                System.out.println("O mes eh Maio");
                break;
            case 6:
                System.out.println("O mes eh Junho");
                break;
            case 7:
                System.out.println("O mes eh Julho");
                break;
            case 8:
                System.out.println("O mes eh Agosto");
                break;
            case 9:
                System.out.println("O mes eh Setembro");
                break;
            case 10:
                System.out.println("O mes eh Outubro");
                break;
            case 11:
                System.out.println("O mes eh Novembro");
                break;
            case 12:
                System.out.println("O mes eh Dezembro");
                break;        
            default:
                System.out.println("Mes desejado nao existe.");
                break;
        }
        System.out.println("Programa finalizado.");
        qnd.close();
    }
}
