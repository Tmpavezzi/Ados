import java.lang.Math;

class Main {
  public static void main(String[] args) {
int [] Result = {0,0,0,0,0,0};
     float gerador=1000000;
    for(int contador = 0;contador<gerador;contador++){
      int a = (int)(Math.random()* 6)+ 1;
      Result [a - 1]= Result[a - 1] +1;
    }
 for(int i =0;i<6;i++){
float Porce= (float)((Result[i]*100)/gerador);
   System.out.println("Numeor " + (i +1) +":"+Porce +"%");
   
 }
    




    
  }
}
