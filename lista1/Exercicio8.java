package lista1;

import java.util.Scanner;


public class Exercicio8 {

   
    public static void main(String[] args) {
         Scanner guardar = new Scanner(System.in);
        System.out.printf("Digite 1° numero:");
        int numero1 = guardar.nextInt();
         System.out.printf("Digite 2° numero:");
        int numero2 = guardar.nextInt();
        System.out.println(multiplicacaoSomandoAteResultadoCorreto(numero1, numero2));
    }
    
    static int multiplicacaoSomandoAteResultadoCorreto(int a, int b) {
	if(a == 0 || b == 0) {
		return 0;
	}
	if(b == 1) {
		return a;
	}
	return a + multiplicacaoSomandoAteResultadoCorreto(a, b - 1);
}
}
