package PrimeiraLista;

import java.util.Scanner;

public class TrianguloeTristeza {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner num = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa.\nIrei ler tres numeros inteiros e irei mostrar em ordem crescente.");

        System.out.println("Digite o primeiro numero:");
        n1 = num.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = num.nextInt();

        System.out.println("Digite o terceiro numero:");
        n3 = num.nextInt();

        if (n1 == n2 && n2 == n3)
        {
            System.out.printf("Dado os numeros %d, %d e %d o seu triangulo eh equilatero.", n1, n2, n3);
        }else if (n1 < n2 && n2 == n3)
        {
            System.out.printf("Dado os numeros %d, %d e %d o seu triangulo eh isosceles.", n1, n2, n3);
        }else if (n1 > n2 && n2 == n3)
        {
            System.out.printf("Dado os numeros %d, %d e %d o seu triangulo eh isosceles.", n1, n2, n3);
        }else if (n1 == n2 && n2 < n3)
        {
            System.out.printf("Dado os numeros %d, %d e %d o seu triangulo eh isosceles.", n1, n2, n3);
        }else if (n1 == n2 && n2 > n3)
        {
            System.out.printf("Dado os numeros %d, %d e %d o seu triangulo eh isosceles.", n1, n2, n3);
        }
        else if (n1 > n2 && n2 > n3)
        {
            System.out.printf("Dado os números %d, %d e %d o seu triangulo eh escaleno.", n1, n2, n3);
        }
        else if (n1 > n2 && n2 < n3)
        {
            System.out.printf("Dado os números %d, %d e %d o seu triangulo eh escaleno.", n1, n2, n3);
        }else if (n1 < n2 && n2 > n3)
        {
            System.out.printf("Dado os números %d, %d e %d o seu triangulo eh escaleno.", n1, n2, n3);
        }else if (n1 < n2 && n2 < n3)
        {
            System.out.printf("Dado os números %d, %d e %d o seu triangulo eh escaleno.", n1, n2, n3);
        }
        num.close();
    }
}
