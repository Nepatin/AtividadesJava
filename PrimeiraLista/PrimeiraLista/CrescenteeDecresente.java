package PrimeiraLista;

import java.util.Scanner;

public class CrescenteeDecresente {
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

        if ((n1 <= n2 && n2 <= n3))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
        }
        else if ((n1 <= n3 && n3 <= n2))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
        }
        else if ((n2 <= n1 && n1 <= n3))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
        }
        else if ((n2 <= n3 && n3 <= n1))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
        }
        else if ((n3 <= n1 && n1 <= n2))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
        }
        else if ((n3 <= n2 && n2 < n1))
        {
        System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
        }
        
        System.out.println("Fim do programa.");

        num.close();
        
    }
}

/*


Peguei a formula de um site em que traz a mesma pergunta mas a resolução é em C, troquei as variaveis, fiz uns ajustes e deu tudo bom, irei deixar as outras resoluções (em C) abaixo:



#include <stdio.h>

int main() 
{
  int n1, n2, n3;       /* dados de entrada */
  /*
  printf("Digite tres numeros: ");
  scanf("%d %d %d", &n1, &n2, &n3);
  
  /* Existem 6 possiveis ordens para imprimior os numeros lidos
  if (n1 <= n2 && n2 <= n3)
    {
      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
    }
  else if (n1 <= n3 && n3 <= n2)
    {
      printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
    }
  else if (n2 <= n1 && n1 <= n3)
    {
      printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
    }
  else if (n2 <= n3 && n3 <= n1) 
    {
      printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
    }
  else if (n3 <= n1 && n1 <= n2) 
    {
      printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
    }
  else if (n3 <= n2 && n2 < n1)
    {
      printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
    }

  return 0;
}



#include <stdio.h>

int main() {
  int n1, n2, n3;       * dados de entrada
  
  printf("Digite tres numeros: ");
  scanf("%d", &n1);
  scanf("%d", &n2);
  scanf("%d", &n3);
  
  if (n3 > n1)
    if (n1 > n2)
      printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
    else if (n2 < n3)
      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
  if (n1 > n2)
    if (n2 > n3)
      printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
    else if (n3 < n1)
      printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
  if (n1 < n2)
    if (n3 < n1)
      printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
    else if (n3 < n2)
      printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
  
  return 0;
}

/* 
 * SOLUCAO 3. Igual a solucao 2 com alguns parenteses superfluos que 
 *    devem ajudar a leitura do programa (evitar ambiguida).
 *
 *

#include <stdio.h>

int main() 
{
  int n1, n2, n3;       /* dados de entrada
  
  printf("Digite tres numeros: ");
  scanf("%d", &n1);
  scanf("%d", &n2);
  scanf("%d", &n3);
  
  if (n3 > n1)
    {
      if (n1 > n2)
	{
	  printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
	}
      else 
	{
	  if (n2 < n3)
	    {
	      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
	    }
	}
    }
  
  if (n1 > n2)
    {
      if (n2 > n3)
	{
	  printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
	}
      else 
	{
	  if (n3 < n1)
	    {
	      printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
	    }
	}
    }
  
  if (n1 < n2)
    {
      if (n3 < n1)
	{
	  printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
	}
      else 
	{
	  if (n3 < n2)
	    {
	      printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	    }
	}
    }
  return 0;
}

/* 
 * SOLUCAO 4. Parecida com a solucao 1. Usa condicoes simples, 
 *           ou seja, sem && e ||.
 *
 *

#include <stdio.h>

int main() 
{
  int n1, n2, n3;       * dados de entrada
  
  printf("Digite tres numeros: ");
  scanf("%d %d %d", &n1, &n2, &n3);
  
  Existem 6 possiveis ordens para imprimior os numeros lidos
  if (n1 <= n2)
    { * n1 <= n2
      if (n2 <= n3) 
	{ * n1 <= n2 e n2 <= n3
	  printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
	}
      else 
	{ * n1 <= n2 e n3 < n2
          if (n1 <= n3) 
	    { * n1 <= n3 e n3 < n2 
	      printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	    }
	  else
	    { * n3 < n1 e n1 <= n2 
	      printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
	    }
	}
    }
  else 
    { * n2 < n1
      if (n1 <= n3) 
	{ * n2 < n1 e n1 <= n3
	  printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
	}
      else
        { * n2 < n1 e n3 < n1
	  if (n2 <= n3) 
	    { * n2 <= n3 e n3 < n1
	      printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
	    }
	  else
	    { * n3 < n2 e n2 < n1
	      printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
	    }
	}
    }

  return 0;
}

/* 
 * SOLUCAO 5. Variante da solucao 4. Usa condicoes simples, 
 *           ou seja, sem && e ||.
 *
 *

#include <stdio.h>

int main() 
{
  int n1, n2, n3;       * dados de entrada
  int aux;              * auxiliar para troca de conteudod e variveis
  printf("Digite tres numeros: ");
  scanf("%d %d %d", &n1, &n2, &n3);
  
  * Forca que n1 <= n2

  if (n1 > n2) 
    { 
      * troca o conteudo das variaveis n1 e n2
      aux = n1;
      n1  = n2; 
      n2  = aux;
    }

  * Neste ponto do programa vale que n1 <= n2
  if (n2 <= n3) 
    { * n1 <= n2 e n2 <= n3
      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
    }
  else 
    { * n1 <= n2 e n3 < n2
      if (n1 <= n3) 
	{ * n1 <= n3 e n3 < n2
	  printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	}
      else
	{ * n3 < n1 e n1 <= n2
	  printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
	}
    }
  return 0;
}




 */