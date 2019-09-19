package ex05;

public class Busca {

    public static int buscaBinaria(int X[], int np) {
        int achou = 0;
        int inicio = 0;
        int fim = X.length;
        int meio = (inicio + fim) / 2;
        
        while (inicio <= fim && achou == 0) {
            if (X[meio] == np) {
                achou = 1;
            } else {
                if (np < X[meio]) {
                    fim = meio - 1;
                    meio = (inicio + fim) / 2;
                } else {
                    inicio = meio + 1;
                    meio = (inicio + fim) / 2;
                }
            }
        }
        if (achou == 1) {
            return meio;
        }
        return -1;
    }

    public static int buscaSequencial(int X[], int np) {
        // Buscando o número digitado no vetor
        int achou = 0;
        int i = 0;
        
        while (achou == 0 && X.length > i) {
            if (X[i] == np) {
                achou = 1;
            } else {
                i++;
            }
            if (achou == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaMenorNumero(int X[]) {
        int menor = 2147483647;

        for (int i = 0; i < X.length; i++) {
            if (X[i] < menor) {
                menor = X[i];
            }
        }
        return menor;
    }

    public static int buscaMaiorNumero(int X[]) {
        int maior;
        maior = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] > maior) {
                maior = X[i];
            }
        }
        return maior;
    }

    public static int buscaRepeticoes(int X[], int num) {
        int count = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] == num) {
                count = 1;
            }
        }
        return count;
    }

    public static boolean verificarPar(int x) {
        int count = 0;
        int resto;

        resto = x / 2;

        return (resto == 0);
    }
}
