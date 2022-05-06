import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner entrada=new Scanner (System.in);
    
    int tente = 0;
    char menu;
   
    
    
    do{
       System.out.println("Sua tentaivas " + (tente + 1));
    
System.out.println ("Pergunta \n A \n B \n C \n D \n E \n ");
      menu = entrada.next().charAt(0);
      switch(menu){
        case 'A':
          System.out.print("Correto");
          tente = 3;
          break;
          case'B':
          System.out.println("Errado");
          tente ++;
          break;
        case 'D': 
          System.out.println("Errado");
          tente ++;
          break;
        case 'E': 
          System.out.println("Errado");
          tente ++;
          break;

          
      }

      


      
    }while(tente !=3);
    }
}
