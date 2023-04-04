package ss2.Advanced;

import java.util.Scanner;

public class EqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ 2: ");
        int number2 = Integer.parseInt(sc.nextLine());

        if (number1 == number2) {
            System.out.println("hai số bằng nhau");
        } else
            System.out.println(" hai số không bằng nhau ");
    }
}
