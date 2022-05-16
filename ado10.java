import java.util.Scanner ;



class Main {
  public static void main(String[] args) {
Scanner entrada= new Scanner (System.in);
    int aleatorio = (int) (Math.random()*100);
    int x =0;
    int tentativas =0 ;
    boolean acertou = false;
       System.out.println("\n Vamosjogar : \n Escolha um numero de 1 a 100 \n Boa Sorte ");
    
    while(tentativas<5){

System.out.print("Escolha um numero ");
      x= entrada.nextInt();


      if(x + 1== aleatorio||
        x -1 == aleatorio ){
        System.out.println("Ta quente ");
        }
      if(x>aleatorio){
        System.out.println(" O numero e menor");
      }else if (x<aleatorio){
        System.out.println("O numeor e maior ");
      }
   if(x==aleatorio){
    tentativas = 5;
  acertou = true;
     
   }

    
     }
tentativas ++;

      
   if(acertou){
  System.out.print("Ganhou ");
}else{
    System.out.print("Perdeu \n Falta conhecimento e odio \n o numeoro era  " + aleatorio);
  
}

  

    

    
  }
}
