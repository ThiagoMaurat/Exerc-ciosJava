import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) throws Exception {
        // Um posto está vendendo combustíveis com a seguinte tabela de
        // descontos:
        // a) Álcool:
        // - até 20 litros, desconto de 3% por litro
        // - acima de 20 litros, desconto de 5% por litro
        // b) Gasolina:
        // - até 20 litros, desconto de 4% por litro
        // - acima de 20 litros, desconto de 6% por litro
        // Escreva um algoritmo que leia o número de litros vendidos, o tipo de
        // combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
        // imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
        // gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de litros vendidos: ");
        int litros = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String combustivel = input2.nextLine();
        double valor = 0;
        if (combustivel.equals("A")) {
            if (litros <= 20) {
                valor = litros * 1.9;
            }
            if (litros > 20) {
                valor = litros * 1.9 * 0.95;
            }
        } else if (combustivel.equals("G")) {
            if (litros <= 20) {
                valor = litros * 2.5;
            }
            if (litros > 20) {
                valor = litros * 2.5 * 0.96;
            }
        }
        System.out.printf("O valor a ser pago pelo cliente é R$ %.2f", valor);
    }

}
