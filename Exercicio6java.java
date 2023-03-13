
package com.mycompany.exercicojava;
import java.util.Scanner;

public class Exercicio6java {
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        
        String nota1, nota2, nota3;
        
        System.out.print("digite sua primeira nota: ");
            nota1 = texto.nextLine();
        System.out.print("digite sua segunda  nota: ");
            nota2 = texto.nextLine();
        System.out.print("digite sua terceira nota: ");
            nota3 = texto.nextLine();
            
            float n1 = Float.parseFloat(nota1);
             float n2 = Float.parseFloat(nota2);
              float n3 = Float.parseFloat(nota3);
            
        float total = ((n1 + n2 + n3)/3);
        
        System.out.print("a media das tres notas é: "+total);
        
        
        
        
    }
    
}
