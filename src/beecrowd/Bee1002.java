package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
