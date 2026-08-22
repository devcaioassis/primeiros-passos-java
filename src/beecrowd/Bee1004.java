package beecrowd;

import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int PROD = num1 * num2;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
