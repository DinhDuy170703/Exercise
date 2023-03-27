package ss1.shape;

import java.util.Scanner;

public class Cicrle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập r: ");
        double number1 = sc.nextDouble();
        double acreage = (number1 * number1) * 3.14;
        System.out.println("diện tích hình tròn là: " + acreage);

        System.out.println("nhập cạnh c: ");
        double number2 = sc.nextDouble();
        double perimeter = number2 * 2 * 3.14;
        System.out.println("chu vi hình tròn là: " + perimeter);

    }
}
