package ss2.Advanced;

import java.util.Scanner;

public class DoBai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng:");
        int month = Integer.parseInt(sc.nextLine());

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            case 2:
                System.out.println("nhập năm: ");
                int year = Integer.parseInt(sc.nextLine());
                if (year % 4 == 0 && year % 400 == 0) {
                    System.out.println("có 29 ngày");
                } else if (year % 4 == 0 && year % 100 == 0) {
                    System.out.println("co 28 ngay");
                } else if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("co 29 ngay");
                } else if (year % 400 != 0) {
                    System.out.println("co 28 ngay");
                }
                break;
            default:
                System.out.println("khong co thang nay");
                break;

        }

    }
}
