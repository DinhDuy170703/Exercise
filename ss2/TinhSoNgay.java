package ss2;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng");
        int month = Integer.parseInt(sc.nextLine());

        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
                System.out.println("tháng có 31 ngày");
                break;
            case 2:
                System.out.println("tháng có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 10:
            case 12:
                System.out.println("tháng có 30 ngày");
                break;
        }
    }
}
