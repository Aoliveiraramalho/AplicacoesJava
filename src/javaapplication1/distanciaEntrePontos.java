package javaapplication1;

import java.util.Scanner;

public class distanciaEntrePontos {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      double lado, areaQ;
      
      System.out.println("Digite a medida do lado de um quadrado: ");
      lado = ler.nextDouble();
      
      areaQ = Math.pow(lado, 2.0);
      
      System.out.println("Área do quadrado é igual a " + areaQ);
      
      ler.close();
      
    }
    
}
