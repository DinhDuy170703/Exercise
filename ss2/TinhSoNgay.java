package ss2;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng");
        int number1 = Integer.parseInt(sc.nextLine());

        switch (number1) {
            case 1, 3, 5, 7, 8, 11:
                System.out.println("tháng có 31 ngày");
                break;
            case 2:
                System.out.println("tháng có 28 hoặc 29 ngày");
                break;
            case 4, 6, 9, 10, 12:
                System.out.println("tháng có 30 ngày");
                break;
        }
    }
}
