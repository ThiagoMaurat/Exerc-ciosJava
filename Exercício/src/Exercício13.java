import java.util.Scanner;

public class Exercício13 {

    public static void main(String[] args) {
        // Dado uma string com uma frase informada pelo usuário (incluindo
        // espaços em branco), conte:
        // 1. quantos espaços em branco existem na frase.
        // 2. quantas vezes aparecem as vogais a, e, i, o, u.

        int contador = 0;
        int quantidadesa = 0;
        int quantidadee = 0;
        int quantidadei = 0;
        int quantidadeo = 0;
        int quantidadeu = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
            if (frase.charAt(i) == 'a') {
                quantidadesa++;
            }
            if (frase.charAt(i) == 'e') {
                quantidadee++;
            }
            if (frase.charAt(i) == 'i') {
                quantidadei++;
            }
            if (frase.charAt(i) == 'o') {
                quantidadeo++;
            }
            if (frase.charAt(i) == 'u') {
                quantidadeu++;
            }
        }

        System.out.println("A frase possui " + contador + " espaços em branco.");
        System.out.println("A frase possui " + quantidadesa + " vezes a.");
        System.out.println("A frase possui " + quantidadee + " vezes e.");
        System.out.println("A frase possui " + quantidadei + " vezes i.");
        System.out.println("A frase possui " + quantidadeo + " vezes o.");
        System.out.println("A frase possui " + quantidadeu + " vezes u.");
        
    }
}
