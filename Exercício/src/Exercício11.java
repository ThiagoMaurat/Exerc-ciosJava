import java.util.Scanner;

public class Exercício11 {
    // Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
    // qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
    // número ele deseja ver a tabuada. A saída deve ser conforme o exemplo
    // abaixo:

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int multiplicando = 0;
        int multiplicador = 0;
        for (multiplicando = input; multiplicando <= input; multiplicando++) {
            for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(multiplicando + "X" + multiplicador + "=" + multiplicando * multiplicador);
            }
        }
    }

}
