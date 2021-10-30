import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) throws Exception {
        // Faça um programa para uma loja de tintas. O programa deverá pedir o
        // tamanho em metros quadrados da área a ser pintada. Considere que a
        // cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta
        // é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
        // a quantidades de latas de tinta a serem compradas e o preço total.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double areapitar = scanner.nextDouble();
        double quantidadelitros = Math.ceil(areapitar / 3);
        double quantidadeslatas = Math.ceil(quantidadelitros / 18);
        double preco = Math.ceil(quantidadeslatas * 80);
        System.out.printf("Quantidade de latas de tinta a serem compradas: %.2f\n e o preço total é de %.2f",
                quantidadeslatas, preco);

    }
}
