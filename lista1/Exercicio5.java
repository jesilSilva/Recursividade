package lista1;

import java.util.Scanner;


public class Exercicio5 {

    
    public static void main(String[] args) {
         Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = guardar.nextInt();
        System.out.println(somatorioAteN(numero));
    }
    
    static int somatorioAteN(int numeros){
        
        if(numeros==1)
            return numeros;
        else
            
           return  numeros + somatorioAteN(numeros - 1);
            }
    
        
    
}
