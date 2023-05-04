package ss4;

import java.util.Scanner;

public class SmallestInteger {
    public static int findMin(int number1, int number2, int number3) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        return min;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số nguyên thứ nhất: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("số nguyên thứ hai: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("số nguyên thứ ba: ");
        int number3 = Integer.parseInt(sc.nextLine());
        System.out.println("số nguyên nhỏ nhất là: " + findMin(number1, number2, number3));


    }
}
