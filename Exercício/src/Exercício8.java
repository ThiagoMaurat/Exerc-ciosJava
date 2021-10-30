import java.util.Scanner;

public class Exercício8 {
    // Faça um programa que leia um nome de usuário e a sua senha e não
    // aceite a senha igual ao nome do usuário, mostrando uma mensagem de
    // erro e voltando a pedir as informações.
    //

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        boolean valid = false;

        do {
            System.out.print("Usuário: ");
            user = input.nextLine();
            System.out.print("Senha: ");
            pass = input.nextLine();

            if (user.equals(pass)) {
                System.out.println("Erro! Senha igual ao usuário!");
            } else {
                valid = true;
            }
        } while (!valid);
    }

}
