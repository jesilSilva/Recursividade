package lista1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        System.out.println("Digite um número que deseja ver o fatorial:");
        int numero = guardar.nextInt();
        System.out.println("O fatorial do número é:" + fatorial(numero));
    }

    public static int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }

    }
}
