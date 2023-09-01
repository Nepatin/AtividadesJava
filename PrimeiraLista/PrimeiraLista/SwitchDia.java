package PrimeiraLista;

import java.util.Scanner;

public class SwitchDia {
    public static void main(String[] args) {
        int dia;

        Scanner qnd = new Scanner(System.in);

        System.out.println("Ola, bem vindo ao meu programa! Digite um numero de 1 a 7 para mostrar o dia da semana.");

        System.out.println("Digite o numero do dia desejado: ");

        dia = qnd.nextInt();

        switch (dia) {
            case 1:
                System.out.println("O dia eh Segunda");
                break;
            case 2:
                System.out.println("O dia eh Terca");
                break;
            case 3:
                System.out.println("O dia eh Quarta");
                break;
            case 4:
                System.out.println("O dia eh Quinta");
                break;
            case 5:
                System.out.println("O dia eh Sexta");
                break;
            case 6:
                System.out.println("O dia eh Sabado");
                break;
            case 7:
                System.out.println("O dia eh Domingo");
                break;
            default:
                System.out.println( "Dia desejado nao existe.");
                break;
        }
        System.out.println("Programa Finalizado.");
        qnd.close();
    }
}
