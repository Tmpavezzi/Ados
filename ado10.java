import java.util.Scanner ;



class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    
    int aleatorio = (int) (Math.random()*100);
   boolean acertou = false  ;
    int tentativas = 0;
      int usuario =0;
    System.out.println("\n Vamosjogar : \n Escolha um numero de 1 a 1000 \n Boa Sorte ");
    
  while(tentativas <5){
    System.out.println(" Escolha um numero ");
    usuario  = entrada.nextInt();
    if(usuario + 1 == aleatorio ||
      usuario - 1 == aleatorio){
      System.out.println("Ta quente ");
      }else if (usuario < aleatorio){
      System.out.println("Ta frio \n O numero  e maior ");
      }else if (usuario>aleatorio){
      System.out.println("ta frio \n O numeor  e menor ");
      }
    if(usuario == aleatorio){
      tentativas = 5;
     acertou = true ;

    }

    tentativas ++;


    
  }
    
    System.out.println("Perdeu \n O numero era " + aleatorio );



    
  }
}
