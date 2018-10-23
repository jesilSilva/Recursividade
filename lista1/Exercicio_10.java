package lista1;

import java.util.Scanner;
import static lista1.Exercicio9.numerosNaturaisCrescente;

public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = guardar.nextInt();
        numerosNaturaisCrescente(numero);

    }

    static int numerosNaturaisDecrescente(int numeros) {
        if (numeros == -1) {
            return 0;
        }
        System.out.printf("%d ", numeros);
        return numerosNaturaisDecrescente(numeros - 1);
    }

    static int sequencia(int n) {
        if (n < 0) {
            return numerosNaturaisDecrescente(n * -1);
        }
        return numerosNaturaisDecrescente(n);
    }
}
