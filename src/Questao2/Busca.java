package Questao2;

public class Busca {

    //<editor-fold desc="Contagem de números iguais ao maior">
    public static int buscaMaior(Numeros vetor[], int n) {
        int i, contadorMaior = 0;
        double maior = vetor[n].getNumero();
        
        for(i=0; i<n; i++){
            if(vetor[i].getNumero() == maior)
                contadorMaior++;
        }
        return contadorMaior;
    }
    //</editor-fold>
    
    //<editor-fold desc="Contagens de números iguais ao menor">
    public static int buscaMenor(Numeros vetor[], int n) {
        int i, contadorMenor = 0;
        double menor = vetor[0].getNumero();
        
        for(i=0; i<n; i++) {
            if(vetor[i].getNumero() == menor)
                contadorMenor++;
        }
        return contadorMenor;
    }
    //</editor-fold>
    
        public static int BuscaNumeroRepeticoes(Numeros X[], double num) {
        int count = 0;
        
        for (int i = 0; i < X.length; i++) {
            if (X[i].getNumero() == num) {
                count++;
            }
        }
        return count;
    }
}
