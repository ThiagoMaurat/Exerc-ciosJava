import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        // Faça um programa que peça para n pessoas a sua idade, ao final o
        // programa deverá verificar se a média de idade da turma varia entre 0 e
        // 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou
        // idosa, conforme a média calculada.

        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de pessoas: ");
        n = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a idade da pessoa " + (i) + ": ");
            int n2 = input2.nextInt();
            soma = soma + n2;
        }

        System.out.println("A média das idades é: " + (soma / n));

        if ((soma / n) <= 25) {
            System.out.println("A turma é jovem");
        } else if ((soma / n) <= 26) {
            System.out.println("A turma é adulta");
        } else if ((soma / n) <= 60) {
            System.out.println("A turma é idosa");
        }

    }
}
