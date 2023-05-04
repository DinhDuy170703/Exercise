package ss4;

import java.util.Scanner;
import java.lang.*;
public class PassInTwoIntegers {
    public static int changePlaces(int number1, int number2) {
        int number = number1;
             number1 = number2;
             number2 = number;
        System.out.println("đổi số cho nhau: ");
        if (number == number1) {
            System.out.println(number2);
        } else if (number == number2) {
            System.out.println(number1);
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số nguyên thứ nhất: ");
        int number1 = java.lang.Integer.parseInt(sc.nextLine());
        System.out.println("Số nguyên thứ hai: ");
        int number2 = java.lang.Integer.parseInt(sc.nextLine());
        System.out.println(changePlaces(number1,number2));
    }
}
