package ss2;

import java.util.Scanner;

public class Min3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        double number1 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số thứ hai: ");
        double number2 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số thứ ba: ");
        double number3 = Double.parseDouble(sc.nextLine());

        double min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        System.out.println("số nhỏ nhất là: " + min);
    }

}
