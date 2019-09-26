package ex05;

import static ex05.Ordenacao.bubbleSortCrescenteVetor;
import static ex05.Busca.buscaBinaria;
import static ex05.Busca.buscaNumeroRepeticoes;
import static ex05.Busca.buscaSequencial;
import static ex05.Busca.verificarPar;
import java.util.Scanner;

public class Ex05Main {

    public static void main(String[] args) {

        int n = 15;
        int vet[] = new int[n];
        int i, num, numProcurado;
        int existe = 1;

        //GRAVANDO OS DADOS NO VETOR
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            while (existe == 1) {

                System.out.println("Digite o " + (i + 1) + " º número: ");
                num = scanner.nextInt();

                existe = buscaNumeroRepeticoes(vet, num);

                if (existe == 1) {
                    System.out.println(" O número digitado já existe. Digite outro!");
                } else {
                    vet[i] = num;
                }
            }
            existe = 1;
        }

        //ORDENANDO OS DADOS DO VETOR
        bubbleSortCrescenteVetor(vet);

        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + "º numero: " + vet[i]);
        }

        //System.out.println("Escolha a busca a ser usada:\n1) Busca sequencial\n2) Busca binária");
        //int opt = scanner.nextInt();
        //SELECIONANDO O NUMERO DESEJADO PARA REALIZAR BUSCA SEQUENCIAL
        boolean repeteSeq = true;
        while (repeteSeq) {
            //switch(opt)
            System.out.println("\nBUSCA SEQUENCIAL: ");
            System.out.println("Digite o número desejado: ");
            numProcurado = scanner.nextInt();

            //BUSCANDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
            int local = buscaSequencial(vet, numProcurado);
            if (local == -1) {
                System.out.println("Número não localizado!");
            } else {
                repeteSeq = false;
                //EXIBINDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
                System.out.println("O número se encontra na posição: " + local + " no vetor.");

                if (verificarPar(local)) {
                    System.out.println("Está em uma posição par");
                } else {
                    System.out.println("Está em uma posição impar");
                }

            }
        }

        //SELECIONANDO O NUMERO DESEJADO PARA REALIZAR BUSCA BINARIA
        boolean repeteBin = true;
        while (repeteBin) {
            System.out.println("\nBUSCA BINÁRIA: ");
            System.out.println("Digite o número desejado: ");
            numProcurado = scanner.nextInt();

            //BUSCANDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
            int local = buscaBinaria(vet, numProcurado);
            if (local == -1) {
                System.out.println("Número não localizado!");
            } else {
                repeteBin = false;
                //EXIBINDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
                System.out.println("O número se encontra na posição: " + local + " no vetor.");

                if (verificarPar(local)) {
                    System.out.println("Está em uma posição par");
                } else {
                    System.out.println("Está em uma posição impar");
                }

            }
        }
    }
}
