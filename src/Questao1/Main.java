package Questao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        Funcionario fvetor[] = new Funcionario[n];
        System.out.println("Questão 1:");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Digite o salário do " + (i + 1) + "ºfuncionário");
            double salario = sc.nextDouble();
            fvetor[i] = new Funcionario(nome, salario) {
            };
            sc.nextLine();
        }
        boolean questao1 = true;
        while (questao1 == true) {
            System.out.println("\nDigite a alternativa desejada:\n"
                    + "a)Ordem crescente de salário\n"
                    + "b)Ordem decrescente de salário\n"
                    + "c)Ordem alfabética:");
            String alternativa = sc.nextLine();
            switch (alternativa) {
                case "a":
                    System.out.println("Digite o método desejado para ordenação:\n"
                            + "1)Bubble sort\n"
                            + "2)Insertion sort\n"
                            + "3)Merge sort");
                    String ordenacaoA = sc.nextLine();
                    switch (ordenacaoA) {
                        case "1":
                            OrdenacaoA.ordemCrescenteBubbleSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "2":
                            OrdenacaoA.ordemCrescenteInsertionSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "3":
                            OrdenacaoA.ordemCrescenteMergeSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                    }
                    break;
                case "b":
                    System.out.println("Digite o método desejado para ordenação:\n"
                            + "1)Bubble sort\n"
                            + "2)Insertion sort\n"
                            + "3)Merge sort");
                    String ordenacaoB = sc.nextLine();
                    switch (ordenacaoB) {
                        case "1":
                            OrdenacaoB.ordemDecrescenteBubbleSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "2":
                            OrdenacaoB.ordemDecrescenteInsertionSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "3":
                            OrdenacaoB.ordemDecrescenteMergeSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                    }
                    break;
                case "c":
                    System.out.println("Digite o método desejado para ordenação:\n"
                            + "1)Bubble sort\n"
                            + "2)Insertion sort\n"
                            + "3)Merge sort");
                    String ordenacaoC = sc.nextLine();
                    switch (ordenacaoC) {
                        case "1":
                            OrdenacaoC.ordemAlfabeticaBubbleSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "2":
                            OrdenacaoC.ordemAlfabeticaInsertionSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                        case "3":
                            OrdenacaoC.ordemAlfabeticaMergeSort(fvetor, n);
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nome: "
                                        + fvetor[i].getNome()
                                        + ", salário: "
                                        + fvetor[i].getSalario());
                            }
                            break;
                    }
                    break;
            }
        }
    }
}
