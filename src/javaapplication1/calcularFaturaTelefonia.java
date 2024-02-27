package javaapplication1;

import java.util.Scanner;

public class calcularFaturaTelefonia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o total de minutos: ");
        int minutos = ler.nextInt();
        double fatura;
        
        fatura = 49.90;

        if (minutos > 120){
        fatura = fatura + (minutos - 120) * 2.40;
        }
        System.out.printf("Valor da fatura = R$ %.2f%n", fatura);
        
        ler.close();
        //AdriAQNA
    }
    
}
