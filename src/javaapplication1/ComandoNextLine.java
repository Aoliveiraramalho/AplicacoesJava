package javaapplication1;

import java.util.Scanner;

public class ComandoNextLine {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
        
       String nomeCompleto;
       int idade;
 
       nomeCompleto = ler.nextLine();
       idade= ler.nextInt();
 
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        
        ler.close();
    }
    
}
