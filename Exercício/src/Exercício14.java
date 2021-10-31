import java.util.Scanner;

public class Exercício14 {
    // Faça um programa que permita ao usuário digitar o seu nome e em
    // seguida mostre o nome do usuário de trás para frente utilizando somente
    // letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário
    // pode digitar letras maiúsculas ou minúsculas.

    public static void main(String[] args) {
        String nome = "";
        System.out.println("Digite o nome:");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        
        for (int i = nome.length() - 1; i >= 0; i--) {
            System.out.print(nome.toUpperCase().charAt(i));
        }

    }
}
