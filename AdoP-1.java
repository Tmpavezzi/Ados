//Faça um programa que solicite ao usuário dois valores inteiros: valor inicial e o valor final de uma faixa de valores. Considere ambos os valores positivos.

O programa deve percorrer a faixa de valores usando o laço WHILE e imprimir ao final:

A quantidade de números ímpares;
A quantidade de números divisíveis por 3 e 4 ao mesmo tempo.
O valor final deve ser obrigatoriamente maior do que o valor inicial, caso contrário, o programa informa o erro "VALORES INVÁLIDOS" e encerra o programa//
  
  import java.util.Scanner ;

class Main {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int qpIMPAR= 0;
    int qDiv=0;
    int valorI;
    int valorF;
    System.out.print("Digie um valor ");
      valorI=entrada.nextInt();
      System.out.print("Digie um valor :");
    valorF=entrada.nextInt();
    while(valorI<=valorF){
      if(valorI%2==1){
        qpIMPAR++;
      }
      if((valorI%3==0) && (valorI%4==0)){
        qDiv++;      
        }
    valorI++;
    }
    System.out.println("Numero impar e " + qpIMPAR );
    System.out.println("Numeros divido por 3 e 4 " + qDiv);
  }
}

