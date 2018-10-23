package lista1;

import java.util.Scanner;


public class Exercicio9 {

    
    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = guardar.nextInt();
        numerosNaturaisCrescente(numero);

    }

    static int numerosNaturaisCrescente(int numeros) {
        if (numeros == -1) {
            return 0;
        } else {
            System.out.printf("%d ", numeros);
        }
        return 1 + numerosNaturaisCrescente(numeros - 1);
    }

    static int sequencia(int n) {
        if (n < 0) {
            return numerosNaturaisCrescente(n * -1);
        }
        return numerosNaturaisCrescente(n);
    }
   
}
