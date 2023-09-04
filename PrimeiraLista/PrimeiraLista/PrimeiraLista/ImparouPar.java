package PrimeiraLista;


import java.util.Scanner;

public class ImparouPar {
    public static void main(String[] args) {
        int numero;

        numero= 0;

        Scanner num = new Scanner (System.in);

        System.out.println("Ola, bem vindo! Irei descobrir se seu numero inteiro digitado e par ou impar");

        System.out.println("Digite o numero:");
        numero= num.nextInt();

        if (numero % 2 == 0){
            System.out.println("Numero e par");            
        }else{
            System.out.println("Numero e impar");
        }
      System.out.println("Programa Finalizado.");
      num.close();  
    }
}
