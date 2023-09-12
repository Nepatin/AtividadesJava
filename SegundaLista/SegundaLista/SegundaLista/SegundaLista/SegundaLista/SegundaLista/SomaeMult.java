package SegundaLista.SegundaLista.SegundaLista;

import java.util.Scanner;

public class SomaeMult {
    public static void main(String[] args) {

        int pri=0, seg=0, sompar=0, rec=0, imp=1;

        Scanner input = new Scanner (System.in);

        System.out.println("Olá, bem vindo ao meu programa.\nIrei calcular e mostrar: a soma dos numeros pares desse intervalo de numeros, incluindo os numeros digitados, e tambem irei mostrar a multiplicacao dos numeros impares desse intervalo, incluindo os digitados");

        System.out.println("Digite o primeiro valor:");
        pri= input.nextInt();

        System.out.println("Digite o segundo valor:");
        seg= input.nextInt();

        if (seg>pri)
        {
            for(rec=pri; rec<=seg; rec++)
            {
                if(rec%2==0){
                    sompar= sompar + rec;
                }else{
                    imp = imp * rec;
            }
        }
        System.out.printf("A soma do numero pares nesse intervalo e %d\n", sompar);
        System.out.printf("A multiplicacao dos numeros impares nesse intervalo e %d", imp);
    }
    else{
        System.out.println("O primeiro numero nao pode ser maior que o Segundo");
    }
    input.close();
    }
}