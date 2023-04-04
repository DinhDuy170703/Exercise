package ss2.Advanced;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class QuadaracticEquation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("nhập vàp b:");
        double b = sc.nextDouble();

        double x = ((-b) / a);

        if (a == 0 && b == 0) {
            System.out.println("phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("vô nghiệm");
        } else if (a != 0) {
            System.out.println("có 1 nghiệm duy nhất " + x);
        }
    }
}
