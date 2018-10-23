package lista1;

import java.util.Scanner;


public class Exercicio3 {

   
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = guardar.nextInt();
        System.out.println("O número inverso");

        inversaoNumeros(numero);
        
        
    }

    static int inversaoNumeros(int numeros) {
        if (numeros == 0) 
            return numeros;
         else 
            System.out.printf("%d ", numeros % 10);
        
        numeros = numeros / 10;
        return inversaoNumeros(numeros);
    }

}
