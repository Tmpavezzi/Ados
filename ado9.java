import java.util.Scanner ;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

Scanner entrada = new Scanner (System.in);
     System.out.println("Digite um numero ");
    double max = entrada.nextDouble();
    System.out.println("Digie um numero ");
    double min = entrada.nextDouble();

    if(min<max){
      double au = min;
      min = max;
      max = au;
    }
    double n1 = (Math.random()*((max-min)+1))+min;
    double n2 = (Math.random()*((max-min)+1))+min;
   
      String message = String.format("a função de segundo grau respeita o  intevalo de %.2f a %.2f \nf(x) %.2f * x + %.2f",min,max ,n1,n2 );
    System.out.println(message);


    
  }
}
