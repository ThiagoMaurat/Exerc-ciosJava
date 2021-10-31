import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercício9 {
    // O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
    // programa que leia um conjunto indeterminado de temperaturas, e informe ao
    // final a menor e a maior temperaturas informadas, bem como a média das
    // temperaturas.

    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<Double>();
        String Temperaturainput = "";
        do {
            System.out.println("Digite a temperatura. Quando quiser sair pressione exit.");
            Scanner input = new Scanner(System.in);
            Temperaturainput = input.nextLine();
            if (Temperaturainput.equals("exit")) {
                break;
            }
            Temperaturainput.replace("exit", "");
            double Temperaturasdouble = 0;
            Temperaturasdouble = Double.parseDouble(Temperaturainput);
            temperaturas.add(Temperaturasdouble);
        } while (true);
        // informar a menor e maior temperatura
        double maior = temperaturas.get(0);
        double menor = temperaturas.get(0);
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > maior) {
                maior = temperaturas.get(i);
            }
            if (temperaturas.get(i) < menor) {
                menor = temperaturas.get(i);
            }
        }

        // média das tempraturas
        double soma = 0;
        for (int i = 0; i < temperaturas.size(); i++) {
            soma = soma + temperaturas.get(i);
        }
        double media = soma / temperaturas.size();

        // saída
        System.out.printf("A maior temperatura é %.2f e a menor é %.2f. A média é %.2f", maior, menor, media);
    }
}
