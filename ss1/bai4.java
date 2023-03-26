package ss1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm toán: ");
        double number1 = Double.parseDouble(sc.nextLine());
        System.out.println("Điểm Lý: ");
        double number2 = Double.parseDouble(sc.nextLine());
        System.out.println("Điểm hóa: ");
        double number3 = Double.parseDouble(sc.nextLine());
        double sum = (number1 + number2 + number3) / 3;
        System.out.println("Điểm trung bình là " + sum);
    }
}
