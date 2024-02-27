package javaapplication1;

import java.util.Scanner;

public class JavaQuebraDeLinha {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       String texto1, texto2, texto3;
 
       texto1 = ler.nextLine();
       texto2 = ler.nextLine();
       texto3 = ler.nextLine();
     
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
     
        ler.close();
    }
    
}
