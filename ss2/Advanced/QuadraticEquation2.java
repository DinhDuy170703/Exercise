package ss2.Advanced;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("nhập vào b: ");
        double b = sc.nextDouble();
        System.out.println("nhập vào c: ");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);
        System.out.println("delta = " + delta);

        if (delta < 0) {
            System.out.println("vô nghiệm");
        } else if (delta == 0) {
            System.out.println("có 2 nghiệm kép");
        } else if (delta > 0) {
            System.out.println("có 2 nghiệm x1 ,x2");
        } else
            System.out.println("--------");
    }
}
