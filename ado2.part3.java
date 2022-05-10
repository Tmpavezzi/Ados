import java.util.Scanner ;


class Main {
  public static void main(String[] args) {
int m ;
 Scanner entrada = new Scanner (System.in);
  System.out.print("Digie um valor ");
    m= entrada.nextInt();

  for(int c=1;c<11;c++){
  System.out.print( m + "X" + c + " = " +  (m*c) + "\n");
  }



    
  }
}
