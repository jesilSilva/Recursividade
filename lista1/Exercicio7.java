package lista1;

import java.util.Scanner;


public class Exercicio7 {

   
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = guardar.nextInt();
        System.out.printf("Informe o digito que deseja saber quantas vezes ele aparece no número digitado:");
        int digito = guardar.nextInt();

        System.out.println("O digito aparece: " + qtdsVezesDigitoAparece(numero, digito, 0) + " vezes no número informado.");

    }

    static int qtdsVezesDigitoAparece(int numero, int resto, int contador) {
        if (numero % 10 == resto) {
            contador++;
        }
        if (numero % 10 == numero) {
            return contador;
        }
        return qtdsVezesDigitoAparece(numero / 10, resto, contador);
    }
}
