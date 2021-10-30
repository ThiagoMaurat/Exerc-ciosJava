import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) throws Exception {
        // João Papo-de-Pescador, homem de bem, comprou um microcomputador
        // para controlar o rendimento financeiro de seu trabalho. Toda vez que ele
        // traz um peso de peixes maior que o estabelecido pelo regulamento de
        // pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00
        // por quilo excedente. João precisa que você faça um programa que leia a
        // variável peso (peso de peixes) e calcule o excesso. Gravar na variável
        // excesso a quantidade de quilos além do limite e na variável multa o valor
        // da multa que João deverá pagar. Imprima os dados do programa com as
        // mensagens adequadas.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso de peixes: ");
        double peso = sc.nextDouble();
        double excesso = peso - 50;
        double multa = excesso * 4;
        System.out.printf("O excesso de peixes é de %.2f quilos e a multa é de R$ %.2f", excesso, multa);

    }
}
