package ss2;

import java.util.Scanner;

public class Min3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ hai: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ ba: ");
        int number3 = Integer.parseInt(sc.nextLine());

        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        System.out.println("số nhỏ nhất là:" + min);
    }

}
