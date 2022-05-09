import java.util.Scanner ;


class Main {
  public static void main(String[] args) {
Double m ;
 Scanner entrada = new Scanner (System.in);
    System.out.print("Digite um ano \n ");
    m = entrada.nextDouble();

    if((m%400==0)||(m%4==0)){
      System.out.println("E um ano Bissexto ");
    }else{
      System.out.println("Não e um ano bissexto ");
    }
    



    
  }
}
