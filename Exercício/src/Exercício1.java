import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) throws Exception {
        // // Tendo como dados de entrada a altura do usuário, construa um algoritmo
        // que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 .
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Seu peso ideal é: " + ((72.7 * altura) - 58));
    }
}
