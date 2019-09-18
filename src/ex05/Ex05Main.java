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
        int i, num, np;
        int existe = 1;
        
        //##################################################################################################

        //leitura dos números para guardar no vet
        try (Scanner scanner = new Scanner(System.in)) {
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
            scanner.close();
        }

        //##################################################################################################
        
        //ORDENANDO O VETOR
        bubbleSortCrescenteVetor(vet);

        //##################################################################################################

        //SELECIONANDO O NUMERO DESEJADO
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o número desejado: ");
            np = sc.nextInt();
            sc.close();
        }
        
        //BUSCANDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        int local = buscaSequencial(vet, np);
        
        local++; // Convertendo para uma posição amigavel ao usuário de acordo com a sequencia digitada.
        
        //EXIBINDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        System.out.println("Pela busca sequencial,o número desejado se encontra na posição: " + local);
        
        if(verificarPar(local)){
            System.out.println("Esta em uma posição par");
        }else{
            System.out.println("Esta em uma posição impar");
        }
        
        //##################################################################################################
        
        //SELECIONANDO O NUMERO DESEJADO
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o número desejado: ");
            np = sc.nextInt();
            sc.close();
        }
        
        //BUSCANDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        local = buscaBinaria(vet, np);
        
        //EXIBINDO O INDICE DO VETOR QUE CONTEM O NUMERO DESEJADO
        System.out.println("Pela busca binária,o número desejado se encontra na posição: " + local);
        
        if(verificarPar(local)){
            System.out.println("Esta em uma posição par");
        }else{
            System.out.println("Esta em uma posição impar");
        }        
        
   
    }
}
