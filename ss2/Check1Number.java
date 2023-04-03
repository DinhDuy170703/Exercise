package ss2;

import java.util.Scanner;

public class Check1Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int number1 = Integer.parseInt(sc.nextLine());
        if (number1 % 3 == 0) {
            System.out.println("số chia hết cho 3");
        } else
            System.out.println("số không chia hết cho 3");
    }
}
