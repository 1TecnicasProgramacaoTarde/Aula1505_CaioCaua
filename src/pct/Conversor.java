package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class Conversor {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\t\t -- Calculadora --\n");
        //Entrada
        System.out.println("Soma Simples");
        System.out.print("Informe n1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe n2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 + n2;
        
        
        //Saída
        System.out.println("\n\t " + n1 + " + " + n2 + " = " + total);
        
        
        
        
        
    }
    
    
}
