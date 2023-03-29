package ss1.shape;

import java.util.Scanner;

public class Rightriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        double a = sc.nextDouble();
        System.out.println("nhap canh b: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2 )+ Math.pow(b, 2));
        System.out.println("canh c con lai la: "+ c);
    }
}
