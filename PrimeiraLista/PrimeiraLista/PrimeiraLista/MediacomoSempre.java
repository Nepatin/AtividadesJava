package PrimeiraLista;

import java.util.Scanner;

public class MediacomoSempre {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        float n1, n2, n3, media;

        System.out.println("Ola, bem vindo ao meu programa. Irei calcular sua media e direi se voce foi aprovado ou reprovado.\n");

        System.out.println("Digita a 1. Nota: ");
        n1= nota.nextInt();

        System.out.println("Digita a 2. Nota: ");
        n2= nota.nextInt();

        System.out.println("Digita a 3. Nota: ");
        n3= nota.nextInt();

        media= (n1+n2+n3)/3;

        if (media >= 6) {
            System.out.printf("A primeira nota foi %.2f, a segunda foi %.2f e a terceira foi %.2f sendo sua media %.2f, por tanto voce foi aprovado.", n1, n2, n3, media);            
        }else
        {
            System.out.printf("A primeira nota foi %.2f, a segunda foi %.2f e a terceira foi %.2f sendo sua media %.2f, por tanto voce foi reprovado.", n1, n2, n3, media);
        }
        nota.close();
    }
}