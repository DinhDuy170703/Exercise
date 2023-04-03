package ss2;

import java.util.Scanner;

public class Find3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nhất:");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ hai: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ ba: ");
        int number3 = Integer.parseInt(sc.nextLine());

        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("so lon nhat la: " + max);


    }
}
