package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
 
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
        
       String nomeCompleto;
       int idade;
       double altura;
       double peso;
        
       System.out.println("Digite seu nome completo: ");
       nomeCompleto = ler.nextLine();
       
       System.out.println("Digite sua idade: ");
       idade = ler.nextInt();
  
      System.out.println("Digite sua altura:  ");
       altura = ler.nextDouble();
       
      System.out.println("Digite sua peso:  ");
       peso = ler.nextDouble();
      
       System.out.printf("Ola %s, voce tem %d anos." , nomeCompleto, idade);
       System.out.println();
       System.out.println("Altura: " + altura);
       System.out.println("Peso: " + peso);
       ler.close();
       
    }
    
}
