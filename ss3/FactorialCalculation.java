package ss3;

import java.util.Scanner;

public class FactorialCalculation {

    public static void findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
           factorial = i * factorial;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên bất kì: ");
        int number = Integer.parseInt(sc.nextLine());
        findFactorial(number);
    }
}
