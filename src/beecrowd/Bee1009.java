package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeFuncionario = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double totalBonus = (totalVendas * 15) / 100;

        double totalSalario = salarioFixo + totalBonus;

        System.out.printf("TOTAL = R$ %.2f%n", totalSalario);

        scanner.close();
    }
}
