package ss2;

import java.util.Scanner;

public class BodyMassindexBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cân nặng: ");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.println("nhập chiều cao: ");
        double height = Double.parseDouble(sc.nextLine());

        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("gầy");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("bình thuờng");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("thừa cân");
        } else if (30 <= bmi) {
            System.out.println("bị béo phì");
        } else
            System.out.println("bị bệnh đao");
    }
}
