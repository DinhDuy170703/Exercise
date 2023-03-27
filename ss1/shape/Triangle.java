package ss1.shape;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập độ dài đáy: ");
        int number2 = Integer.parseInt(sc.nextLine());
        int acreage = (number1 * number2) / 2;
        System.out.println("diện tích tam giác là: " + acreage);

        System.out.println("nhập cạnh a: ");
        int number3 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh b: ");
        int number4 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh c: ");
        int number5 = Integer.parseInt(sc.nextLine());
        int perimerer = number3 + number4 + number5;
        System.out.println("chu vi tam giác là: " + perimerer);

    }
}
