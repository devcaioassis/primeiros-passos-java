package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double PESONOTA1 = 2.0;
        final double PESONOTA2 = 3.0;
        final double PESONOTA3 = 5.0;

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 * PESONOTA1 + nota2 * PESONOTA2 + nota3 * PESONOTA3) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
