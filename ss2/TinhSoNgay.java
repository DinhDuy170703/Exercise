package ss2;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số ngày");
        int number1 = Integer.parseInt(sc.nextLine());

        switch (number1) {
            case 1,3,5,7,8:
                System.out.println("tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.println("tháng 2 có 28 hoặc 29 ngày");
                break;
        }
    }
}
