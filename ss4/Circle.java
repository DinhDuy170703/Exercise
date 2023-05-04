package ss4;

import java.util.Scanner;

public class Circle {
    public static double areaCircle(float r) {
        double s = r * r * 3.14;
        return s;
    }

    public static double perimeterCircle(float r) {
        double c = r * 2 * 3.14;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính hình tròn: ");
        float r = Integer.parseInt(sc.nextLine());
        System.out.println("diện tích hình tròn là: " + areaCircle(r));
        System.out.println("chu vi hình tròn là: " + perimeterCircle(r));

    }
}
