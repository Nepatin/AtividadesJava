package PrimeiraLista;

import java.util.Scanner;

public class CrescentevarA {
    public static void main(String[] args) {
        int a, b, c;

        Scanner num = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa.\nIrei ler tres numeros inteiros e vou imprimir em ordem crescente.");

        System.out.println("\nDigite o primeiro numero:");
        a = num.nextInt();

        System.out.println("\nDigite o segundo numero:");
        b = num.nextInt();

        System.out.println("\nDigite o terceiro numero:");
        c = num.nextInt();

        if ((a <= b && b <= c))
        {
            System.out.printf("\n%d, %d, %d\n", a, b, c);
        }
        else if ((a <= c && c <= b))
        {
            System.out.printf("\n%d, %d, %d\n", a, c, b);
        }
        else if ((b <= a && a <= c))
        {
            System.out.printf("\n%d, %d, %d\n", b, a, c);
        }
        else if ((b <= c && c <= a))
        {
            System.out.printf("\n%d, %d, %d\n", b, c, a);
        }
        else if ((c <= a && a <= b))
        {
            System.out.printf("\n%d, %d, %d\n", c, a, b);
        }
        else if ((c <= b && b < a))
        {
            System.out.printf("\n%d, %d, %d\n", c, b, a);
        }
        
        System.out.println("\nFim do programa.");

        num.close();
    }
}