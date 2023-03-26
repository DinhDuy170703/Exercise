package ss1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ 1: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ 2: ");
        int number2 = Integer.parseInt(sc.nextLine());
        int sum = number1 * number2;
        System.out.println("Hiệu =" + sum);
    }

}
