package Questao1;

public class OrdenacaoA {

    //<editor-fold desc="Bubble Sort">
    public static void ordemCrescenteBubbleSort(Funcionario[] fvetor, int n) {
        int i;
        int j;
        Funcionario aux;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (fvetor[j].getSalario() > fvetor[j + 1].getSalario()) {
                    aux = fvetor[j];
                    fvetor[j] = fvetor[j + 1];
                    fvetor[j + 1] = aux;
                }
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="Insertion Sort">
    public static void ordemCrescenteInsertionSort(Funcionario[] fvetor, int n) {
        int i;
        int j;
        Funcionario eleito;
        for (i = 1; i < n; i++) {
            eleito = fvetor[i];
            j = i - 1;
            while (j >= 0 && fvetor[j].getSalario() > eleito.getSalario()) {
                fvetor[j + 1] = fvetor[j];
                j--;
            }
            fvetor[j + 1] = eleito;
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="Merge Sort">
    public static void ordemCrescenteMergeSort(Funcionario[] fvetor, int n) {
        int inicio = 0;
        int fim = n;
        
        merge(fvetor, inicio, fim-1);
    }
    
    public static void merge(Funcionario[] fvetor, int inicio, int fim) {
        int meio;
        if(inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(fvetor, inicio, meio);
            merge(fvetor, meio+1, fim);
            intercala(fvetor, inicio, fim, meio);
        }
    }
    
    public static void intercala(Funcionario[] fvetor, int inicio, int fim, int meio) {

        int inicioVet1 = inicio;
        int inicioVet2 = meio + 1;
        Funcionario[] aux = new Funcionario[fvetor.length];
        int posLivre = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (fvetor[inicioVet1].getSalario() <= fvetor[inicioVet2].getSalario()) {
                aux[posLivre] = fvetor[inicioVet1];
                inicioVet1++;
            } else {
                aux[posLivre] = fvetor[inicioVet2];
                inicioVet2++;
            }
            posLivre += 1;
        }
        //Verificar números não usados no vetor esquerdo
        for (int i = inicioVet1; i <= meio; i++) {
            aux[posLivre] = fvetor[i];
            posLivre += 1;
        }
        //Verificar números não usados no vetor direito
        for (int i = inicioVet2; i <= fim; i++) {
            aux[posLivre] = fvetor[i];
            posLivre += 1;
        }

        for(int i = inicio; i<=fim; i++) {
            fvetor[i] = aux[i];
        }
    }
    //</editor-fold>
}
