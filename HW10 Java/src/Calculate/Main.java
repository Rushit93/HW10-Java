package Calculate;

import java.util.Scanner;

public class Main extends Calculate.Calculator {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);
        main.calculateResult(a, b, symbol);
        System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
        char choice = scanner.next().charAt(0);
        while (true) {
            if (choice == 'Y') {
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                System.out.println("Enter symbol: ");
                symbol = scanner.next().charAt(0);
                main.calculateResult(a, b, symbol);
                System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
                choice = scanner.next().charAt(0);
            } else if (choice == 'N') {
                System.exit(0);
            }
        }
    }

}