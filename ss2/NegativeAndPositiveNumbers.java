package ss2;

import java.util.Scanner;

public class NegativeAndPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int number1 = Integer.parseInt(sc.nextLine());

        if (number1 > 0) {
            System.out.println("số dương");
        } else if (number1 < 0) {
            System.out.println("số âm");
        }
    }
}
