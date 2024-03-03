import java.util.Scanner;

public class calculoMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nomeAluno;
        double nota1, nota2, nota3, media;
        
        System.out.println("Digite nome do aluno: ");
        nomeAluno = ler.nextLine();
        
        System.out.println("Digita sua 1ª nota: ");
        nota1 = ler.nextDouble();
        
        System.out.println("Digita sua 2ª nota: ");
        nota2 = ler.nextDouble();
        
        System.out.println("Digita sua 3ª nota: ");
        nota3 = ler.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
       // 
        //System.out.println("Nome Aluno: "+ nomeAluno);
        //System.out.printf("Nota 1 = %.2f %n", nota1);
        //System.out.printf("Nota 2 = %.2f %n",nota1);
        //System.out.printf("Nota 3 = %.2f %n",nota1);
      //  System.out.printf("Sua média é de %.2f ",media);
        
        ler.close();
        
    }
    
}
