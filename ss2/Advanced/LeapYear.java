package ss2.Advanced;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 năm: ");
        int year = Integer.parseInt(sc.nextLine());

        if (year % 4 == 0) {
            System.out.println("năm nhuận");
        } else
            System.out.println("năm thuần");
    }
}
