package Questao2;

import static Questao2.Busca.BuscaNumeroRepeticoes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        int n = 10;
        int aux, i, j;
        Numeros nvetor[] = new Numeros[n];

        //leitura dos números para guardar no vet
        try (Scanner sc = new Scanner(System.in)) {
            for (i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + " º número: ");
                double numero = sc.nextDouble();
                nvetor[i] = new Numeros(numero);
                sc.nextLine();
            }
            
            //Ordenação
            Ordenacao.ordemCrescenteBubbleSort(nvetor, n);
            
            double menor = nvetor[0].getNumero();
            double maior = nvetor[n-1].getNumero();
            
            //Contagem dos extremos
            int contMenor = Busca.BuscaNumeroRepeticoes(nvetor, menor);
            int contMaior = Busca.BuscaNumeroRepeticoes(nvetor, maior);
            
            //mostrando vetor
            System.out.println("\n-----------------\nVetor odernado");

            for (i = 0; i < n; i++) {
                System.out.println((i + 1) + " º número: " + nvetor[i].getNumero());
            }
            System.out.println("O menor número encontrado foi " +
                            nvetor[0].getNumero() +
                            " e ele aparece " +
                            contMenor +
                            " vezes");
                    System.out.println("O maior número encontrado foi " +
                            nvetor[n-1].getNumero() +
                            " e ele aparece " +
                            contMaior +
                            " vezes");
            
        }
    }
}
