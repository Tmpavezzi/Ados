import java.util.Scanner;


class Main {
  public static void main(String[] args) {

Scanner entrada = new Scanner (System.in);
     System.out.print("Digite um lado do triangulo ");
    int y = entrada.nextInt();
    System.out.print("Digite um lado do triangulo ");
    int z = entrada.nextInt();
     System.out.print("Digite um lado do triangulo ");
    int x = entrada.nextInt();

    if((x<z+y)&&(y<x+z)){
    if (x==y&&z==x){
        System.out.print("   equilátero");
    }else if (x==y||z==y){
        System.out.print(" isoceles");
    }else{
      System.out.print(" Escaleno ");
    }
      }else{
      System.out.print("Não e um triangulo ");
      
    }
    }
    
    
    



    
  }
