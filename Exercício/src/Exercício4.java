import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) throws Exception {
        // Faça um programa que faça 5 perguntas para uma pessoa sobre um
        // crime. As perguntas são:
        // a) "Telefonou para a vítima?"
        // b) "Esteve no local do crime?"
        // c) "Mora perto da vítima?"
        // d) "Devia para a vítima?"
        // e) "Já trabalhou com a vítima?"
        // O programa deve no final emitir uma classificação sobre a participação da
        // pessoa no crime. Se a pessoa responder positivamente a 2 questões ela
        // deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
        // como "Assassino". Caso contrário, ele será classificado como "Inocente".

        Scanner input = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? (1-sim/0-não)");
        int a = input.nextInt();
        System.out.println("Esteve no local do crime? (1-sim/0-não)");
        int b = input.nextInt();
        System.out.println("Mora perto da vítima? (1-sim/0-não)");
        int c = input.nextInt();
        System.out.println("Devia para a vítima? (1-sim/0-não)");
        int d = input.nextInt();
        System.out.println("Já trabalhou com a vítima? (1-sim/0-não)");
        int e = input.nextInt();
        int cont = 0;
        if (a == 1) {
            cont++;
        }
        if (b == 1) {
            cont++;
        }
        if (c == 1) {
            cont++;
        }
        if (d == 1) {
            cont++;
        }
        if (e == 1) {
            cont++;
        }
        switch (cont) {
        case 2:
            System.out.println("Suspeita");
            break;
        case 3:
            System.out.println("Cúmplice");
            break;
        case 4:
            System.out.println("Cúmplice");
            break;
        case 5:
            System.out.println("Assassino");
            break;
        }

    }
}
