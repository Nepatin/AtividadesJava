package PrimeiraLista;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int a, b, cn, rec;

        Scanner num = new Scanner (System.in);

        System.out.println("Ola, bem vindo ao meu programa. Irei ler tres numeros inteiros e irei mostrar o maior entre eles.");

        System.out.println("Digite o primeiro numero:");
        a = num.nextInt();

        System.out.println("Digite o segundo numero:");
        b = num.nextInt();

        System.out.println("Digite o terceiro numero:");
        cn = num.nextInt();

        if (a > b) {

            rec= a;

        } else {

            rec= b;

        }

        if(rec > cn) {

    	   System.out.printf("O numero maior e: %d\n", rec);

        } else {

           System.out.printf("O numero maior e: %d\n", cn);

        }

        System.out.println("Fim do programa.");

        num.close();
    }
}

/*
Outra maneira de receber o numero maior:

if (a > b && a > cn) 	//o numero 1 maior que o 2 e 3 ,senão o numero maior é 2 ou 3
	rec = a;			                       //depois compara o numero 2 e 3 pra saber qual o maior
else if (b > cn)			               //o maior valor é gravado rec
	rec = b;
else 
	rec = cn;

OU

rec = cn;
       if (a > rec)
    	   rec = a;
       if (b > rec)
    	   rec = b;
       System.out.printf("O número maior é: %d", rec);

*/