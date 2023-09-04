package PrimeiraLista;

import java.util.Scanner;

public class CrescentevarA {
    public static void main(String[] args) {
        int a, b, c;

        Scanner num = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa.\nIrei ler tres numeros inteiros e irei mostrar em ordem crescente.");

        System.out.println("Digite o primeiro numero:");
        a = num.nextInt();

        System.out.println("Digite o segundo numero:");
        b = num.nextInt();

        System.out.println("Digite o terceiro numero:");
        c = num.nextInt();

        if ((a <= b && b <= c))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", a, b, c);
        }
        else if ((a <= c && c <= b))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", a, c, b);
        }
        else if ((b <= a && a <= c))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", b, a, c);
        }
        else if ((b <= c && c <= a))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", b, c, a);
        }
        else if ((c <= a && a <= b))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", c, a, b);
        }
        else if ((c <= b && b < a))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", c, b, a);
        }
        
        System.out.println("Fim do programa.");

        num.close();
        
    }
}