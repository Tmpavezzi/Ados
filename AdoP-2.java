//Use o laço FOR para fazer um programa que leia e escreva dados de uma turma de 11 alunos.

O programa deve solicitar o primeiro nome, idade e sexo (M=masculino, F=feminino).

Depois de ler os dados das 11 pessoas, o programa deve:

imprimir todos os dados do aluno mais velho
a idade média dos homens
a idade média das mulheres.//

import java.util.Scanner ;

class Main {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int q=0;
    String nome, Nome =" ";
    int id,ID=0;
    String s;
    String S=" ";
    int nMulher=0;
    int nHomen =0;
    int mediaM=0;
    int mediaH=0;

   while(q<11){
     for(int x=0;x<4;x++){
       System.out.print("Digite o nome do Aluno ");
       nome = entrada.next();
       System.out.print("Digite a idade do aluno ");
       id = entrada.nextInt();
        System.out.print("Digite o sexo do aluno F-feminio M-masculino  ");
       s = entrada.next();
       if(id>ID){
         ID=id;
         Nome = nome;
         S=s;
       }
if(s==("M")){
  nHomen++;
  mediaH+=id;
    
}
if(s==("F")){
  nMulher++;
  mediaM+=id;
}

q++;
       
     }
   }
 System.out.print("Aluno mais velho :" +Nome + ID + S );
   
     System.out.println("A idade media do homen : " + mediaH/nHomen);
    System.out.println("A idade media da mulher :" + mediaM/nMulher);

    
    
  }
}
