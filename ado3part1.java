import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner entrada=new Scanner (System.in);
    System.out.print("Valor da compra " + "$");
    Double n= entrada.nextDouble();
    double Soma1= n - (n * 0.2);
    double Soma2= n - (n * 0.15);
    

    if(n>=300){
      System.out.print("Seu desconto foi de 20% \n "+ "Tota a pagar : " + Soma1 + "$");
    }else{
      System.out.print("Seu desconto foi de  15% \n" + "Tota a pagar : " + Soma2 + " $");
      }
    }
}
