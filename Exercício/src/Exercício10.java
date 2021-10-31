import java.util.Scanner;

public class Exercício10 {
    // Faça um programa que peça uma nota, entre zero e dez. Mostre uma
    // mensagem caso o valor seja inválido e continue pedindo até que o
    // usuário informe um valor válido.
    public static void main(String[] args) {
        System.out.println("Digite uma nota entre 0 e 10");
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();
       
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, insira novamente");
            nota = input.nextInt();
        }
     System.out.println("Nota válida");

}


}
