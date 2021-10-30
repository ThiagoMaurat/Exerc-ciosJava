import java.util.Scanner;

public class Exercício7 {

    // As Organizações Tabajara resolveram dar um aumento de salário aos
    // seus colaboradores e lhe contrataram para desenvolver o programa que
    // calculará os reajustes. Faça um programa que recebe o salário de um
    // colaborador e o reajuste segundo o seguinte critério, baseado no salário
    // atual:
    // ● salários até R$ 280,00 (incluindo) : aumento de 20%
    // ● salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    // ● salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    // ● salários de R$ 1500,00 em diante : aumento de 5% Após o aumento
    // ser realizado, informe na tela:
    // ● o salário antes do reajuste;
    // ● o percentual de aumento aplicado;
    // ● o valor do aumento;
    // ● o novo salário, após o aumento.
    double percentual = 0;
    double valor_Aumento = 0;
    double resultado = 0;

    public double Recebersalario(Double salario) {
        if (salario <= 280) {
            resultado = salario + (salario * 0.2);
            percentual = 20;
            valor_Aumento = resultado - salario;

        } else if (salario >= 280 && salario <= 700) {
            resultado = salario + (salario * 0.15);
            percentual = 15;
            valor_Aumento = resultado - salario;

        } else if (salario >= 700 && salario <= 1500) {
            resultado = salario + (salario * 0.1);
            percentual = 10;
            valor_Aumento = resultado - salario;

        } else if (salario >= 1500) {
            resultado = salario + (salario * 0.05);
            percentual = 5;
            valor_Aumento = resultado - salario;
        }
        return salario;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        double salarioinput = input.nextDouble();
        Exercício7 ex7 = new Exercício7();
        ex7.Recebersalario(salarioinput);
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioinput);
        System.out.printf("Percentual de aumento aplicado: %.0f%n", ex7.percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", ex7.valor_Aumento);
        System.out.printf("O novo salário após o aumento é de: %.2f", ex7.resultado);

    }
}
