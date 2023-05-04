package ss1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất :");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số thứ 2: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số thứ 3: ");
        int number3 = Integer.parseInt(sc.nextLine());
        int sum = number1 + number2 + number3;
        System.out.println("Tổng = " + sum);
    }
}
