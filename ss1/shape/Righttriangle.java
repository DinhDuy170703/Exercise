package ss1.shape;

import java.util.Map;
import java.util.Scanner;

public class Righttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh b : ");
        double b = sc.nextDouble();
        System.out.println("nhập cạnh c : ");
        double c = sc.nextDouble();
        double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));

        System.out.println("cạnh a lại là : " + a);


    }
}
