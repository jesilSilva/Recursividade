package lista1;


public class Exercicio4 {

  
    public static void main(String[] args) {

        int vet[] = {1, 20, 37, 4, 5};
        System.out.println("A soma dos vetores é:" + somaVetores(vet, vet.length));

    }

    static int somaVetores(int vetor[], int numeros) {

        if (numeros > 0) {
            return vetor[numeros - 1] + somaVetores(vetor, numeros - 1);

        } else {
            return 0;
        }
    }
}
