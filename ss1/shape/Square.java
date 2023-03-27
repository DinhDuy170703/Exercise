package ss1.shape;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh b: ");
        int number2 = Integer.parseInt(sc.nextLine());
        int acreage = number1 * number2;
        System.out.println("diện tích hình vuông la: " + acreage);

        System.out.println("nhập cạnh c: ");
        int number3 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh d: ");
        int number4 = Integer.parseInt(sc.nextLine());
        int perimeter = number1 + number2 + number3 + number4;
        System.out.println("chu vi hình vuông la: " + perimeter);
    }
}
