
package com.mycompany.exercicojava;
import java.util.Scanner;

public class Exercicio4java {
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        
        System.out.print("digite um numero: ");
            float n1 = texto.nextFloat();
        System.out.print("digite o segundo numero: ");
            float n2 = texto.nextFloat();
            
        float soma = n1 + n2;
        
        float sub = n1 - n2;
        
        System.out.print("a soma dos dois numeros foram: "+soma);
        System.out.print("\na subtraçao dos dois numeros foram: "+sub);
        
        
        
        
        
        
        
        
    }
    
}
