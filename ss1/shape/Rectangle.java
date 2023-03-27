package ss1.shape;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập chiều rộng: ");
        int number2 = Integer.parseInt(sc.nextLine());
        int acreag = number1 * number2;
        System.out.println("Diện tích hình chữ nhật là: " + acreag);

        System.out.println("nhập cạnh a: ");
        int number3 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh b: ");
        int number4 = Integer.parseInt(sc.nextLine());
        int perimeter = (number3 + number4) * 2;
        System.out.println("chu vi hình chữ nhật là: " + perimeter);
    }
}
