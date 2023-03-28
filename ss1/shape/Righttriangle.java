package ss1.shape;

import java.util.Map;
import java.util.Scanner;

public class Righttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a : ");
        double a = sc.nextDouble();
        System.out.println("nhập cạnh b : ");
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("cạnh c lại là : " + c);
    }
}
