package ex05;

import static ex05.Ordenacao.BubbleSortCrescenteVetor;
import static ex05.Busca.BuscaBinaria;
import static ex05.Busca.BuscaMaiorNumero;
import static ex05.Busca.BuscaMenorNumero;
import static ex05.Busca.BuscaNumeroRepeticoes;
//import static ex05.Ordenacao.BubbleSortCrescenteVetor;

import java.util.Scanner;

public class Ex05Main {

    public static void main(String[] args) {

        int n = 3;
        int vet[] = new int[n];
        int aux, i, j, menor, maior, num;
        int desejado;
        int existe = 1;

        //leitura dos números para guardar no vet
        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < n; i++) {
                while (existe == 1) {
                    existe = 0;
                    System.out.println("Digite o " + (i + 1) + " º número: ");
                    num = scanner.nextInt();

                    existe = BuscaNumeroRepeticoes(vet, num);

                    if (existe == 1) {
                        System.out.println(" O número digitado já existe. Digite outro!");
                    } else {
                        vet[i] = num;
                    }
                }
                existe = 1;
            }
            scanner.close();
        }

        //ORDENANDO O VETOR
        BubbleSortCrescenteVetor(vet);

        
        //FUNCIONA ATÉ AQUI!!!
        
        
        //SELECIONANDO O NUMERO DESEJADO
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número desejado: ");
            desejado = scanner.nextInt();
            scanner.close();
        }

        
        //BUSCANDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        int local = BuscaBinaria(vet, desejado);
        
        //EXIBINDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        System.out.println("O número desejado se encontra na posição: " + local);
        
        
        
        
        
        
        
        //IMPLEMENTAR A BUSCA PELO MENOR NUMERO
        menor = BuscaMenorNumero(vet);
        maior = BuscaMaiorNumero(vet);

        //ordenando
//            BubbleSortCrescenteVetor(vet);
        int localmenor;
        localmenor = BuscaBinaria(vet, menor);

        //mostrando vetor
        System.out.println("\n-----------------\nVetor odernado");

        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + " º número: " + vet[i]);
        }
        System.out.println("O menor número se encontra na posição: " + (localmenor + 1));

        int menorRepete;
        menorRepete = BuscaNumeroRepeticoes(vet, menor);
        System.out.println("O menor número aparece: " + menorRepete + " vezes no vetor");

        int maiorRepete;
        maiorRepete = BuscaNumeroRepeticoes(vet, maior);

        System.out.println("O maior número aparece: " + maiorRepete + " vezes no vetor");

    }
}
