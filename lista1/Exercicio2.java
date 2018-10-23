package lista1;


public class Exercicio2 {

    
    public static void main(String[] args) {
       
        System.out.println("enezimo números da sequência de fibonacci:");
        for (int i = 0; i < 50; i++) {
            System.out.print("(" + i + "):" + sequenciaFibonnaci(i) + "\n");
        }
       
       
    }
    
    static long sequenciaFibonnaci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return sequenciaFibonnaci(numero - 1) + sequenciaFibonnaci(numero - 2);
        }
    }
}
