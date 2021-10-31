import java.util.ArrayList;
import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {

        // Uma academia deseja fazer um censo entre seus clientes para descobrir o
        // mais alto, o mais baixo, o maior e o menor peso. Para isto você deve fazer
        // um programa que pergunte a cada um dos clientes da academia seu
        // código, sua altura e seu peso. O final da digitação de dados deve ser dada
        // quando o usuário digitar 0 (zero) no campo código. Ao encerrar o
        // programa também deve ser informados os códigos e valores do cliente
        // mais alto, do mais baixo, do mais gordo e do mais magro, além da média
        // das alturas e dos pesos dos clientes

        int codigo = 1;
        Scanner inputaltura = new Scanner(System.in);
        Scanner inputpeso = new Scanner(System.in);
        Scanner inputcodigo = new Scanner(System.in);
        double maioraltura = 0, menoraltura = 0, maiorpeso = 0, menorpeso = 0;
        double somaaltura = 0, somapeso = 0;
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<Double>();
        ArrayList<Double> pesos = new ArrayList<Double>();
        

        while (true) {

            do {

                System.out.println("Digite o código do cliente: ");
                codigo = inputcodigo.nextInt();
                codigos.add(codigo);
                System.out.println("Digite a altura do cliente: ");
                double altura = inputaltura.nextDouble();
                alturas.add(altura);
                System.out.println("Digite o peso do cliente: ");
                double peso = inputpeso.nextDouble();
                pesos.add(peso);
            } while (codigo != 0);

            if (codigo == 0) {
                break;
            }
        }

            int códigomaioralt = codigos.get(0);
            int códigomenoralt = codigos.get(0);
            for (int i = 0; i < codigos.size(); i++) {
                if (alturas.get(i) > maioraltura) {
                    maioraltura = alturas.get(i);
                    códigomaioralt = codigos.get(i);
                }
                if (alturas.get(i) < menoraltura) {
                    menoraltura = alturas.get(i);
                    códigomenoralt = codigos.get(i);
                }
                if (pesos.get(i) > maiorpeso) {
                    maiorpeso = pesos.get(i);

                }
                if (pesos.get(i) < menorpeso) {
                    menorpeso = pesos.get(i);

                }
                somaaltura += alturas.get(i);
                somapeso += pesos.get(i);
            }

            System.out.printf("O cliente mais alto é %.2f e o código do cliente é %d\n", maioraltura, códigomaioralt);
        System.out.printf("O cliente mais baixo é %.2f e o código do cliente é %d\n", menoraltura, códigomenoralt);
        System.out.printf("O cliente mais gordo é %.2f e o código do cliente é %d\n", maiorpeso, códigomaioralt);
        System.out.printf("O cliente mais magro é %.2f e o código do cliente é %d\n", menorpeso, códigomenoralt);
        System.out.printf("A média das alturas é %.2f\n", somaaltura / alturas.size());
        System.out.printf("A média dos pesos é %.2f\n", somapeso / pesos.size());

        }

        
    }