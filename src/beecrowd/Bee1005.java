package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota01 = scanner.nextDouble();
        double nota02 = scanner.nextDouble();

        double media = (nota01 * 3.5 + nota02 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
