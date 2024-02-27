package javaapplication1;

import java.util.Scanner;

public class areaTrapezio {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        double baseMaior, baseMenor , altura, area; 
      
        System.out.println("Insirir a medida da base maior do trapézio: ");
        baseMaior = ler.nextDouble();
        
        System.out.println("Insirir a medida da base menor do trapézio: ");
        baseMenor = ler.nextDouble();
        
        System.out.println("Insirir a medida da alturar do trapézio: ");
        altura = ler.nextDouble();
        
        area = (baseMaior + baseMenor) * altura / 2.0;
        
        System.out.println("Area do trapézio =  " + area);
 
        ler.close();
    }
    
}
