import java.util.Scanner;

public class Questao1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int[] vet = new int[100];
    int tam = 0;
    boolean rep = false;
    
    System.out.println(" Preencha o vetor (no maximo 100 inteiros): ");
    for (int cont = 0; cont < 100; cont++)
    {
      System.out.print(" Posicao "+(cont+1)+": ");
      vet[cont] = s.nextInt();
      
      if (vet[cont] < 0)
      {
        tam = cont;
        break;
      }
    }
    
    for (int cont1 = 0; cont1 < tam; cont1++)
    {
      for (int cont2 = 0; cont2 < tam; cont2++)
      {
        if (cont1 != cont2)
        {
          if (vet[cont1] == vet[cont2])
          {
            rep = true;
            break;
          }
          else
          {
            rep = false;
          }
        }
      }
      
      if (rep == true)
      {
        break;
      }
    }

    if (rep == false)
    {
      System.out.println("\n Nao ha repeticao de elementos.");
    }
    else 
      System.out.println("\n Ha repeticao de elementos.");
  }
}