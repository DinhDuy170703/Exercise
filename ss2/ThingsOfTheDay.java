package ss2;

import java.util.Scanner;

public class ThingsOfTheDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 ngày trong tuần");
        int day = Integer.parseInt(sc.nextLine());

        switch (day) {
            case 1:
                System.out.println("chủ nhật");
                break;
            case 2:
                System.out.println("thứ hai");
                break;
            case 3:
                System.out.println("thứ ba");
                break;
            case 4:
                System.out.println("thứ tư");
                break;
            case 5:
                System.out.println("thứ năm");
                break;
            case 6:
                System.out.println("thứ sáu");
                break;
            case 7:
                System.out.println("thứ bảy");
                break;
            default:
                System.out.println("không phải thứ trong ngày");
                break;
        }

    }
}