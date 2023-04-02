package ss1.shape;

import java.util.Scanner;

public class Rightriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh b: ");
        double b = Double.parseDouble(sc.nextLine());

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("cạnh c là: " + c);
    }
}

