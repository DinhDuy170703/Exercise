package ss2.Advanced;

import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int number1 = Integer.parseInt(sc.nextLine());

        if (number1 % 2 == 0) {
            System.out.println("số chẵn");
        } else
            System.out.println("số lẻ");
    }
}
