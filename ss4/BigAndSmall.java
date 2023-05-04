package ss4;

import java.util.Scanner;

public class BigAndSmall {
    public static int checkBoolean(int number1, int number2) {
        int sum = 0;
        if (number1 > number2) {
            System.out.println("số thứ nhất lớn hơn số thứ hai");
        } else if (number1 <= number2) {
            sum = number1 + number2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = java.lang.Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ hai: ");
        int number2 = java.lang.Integer.parseInt(sc.nextLine());
        System.out.println(checkBoolean(number1, number2));

    }
}
