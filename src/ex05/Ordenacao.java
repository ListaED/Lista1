package ex05;

public class Ordenacao {

    public static void bubbleSortCrescenteVetor(int vet[]) {
        int i, j, n;
        n = vet.length;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }
}
