import java.util.Scanner;

public class Exercício15 {
    // Faça um Programa que pergunte quanto você ganha por hora e o número
    // de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
    // referido mês.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = input2.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        System.out.println("O salário do mês é: " + salario);
        

    }
}
