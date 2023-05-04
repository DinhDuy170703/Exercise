package ss4;

import java.util.Scanner;

public class IncreaseValueForNumber {
    public static void increaseInValue(int number){
        number = number + 1;
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = Integer.parseInt(sc.nextLine());
        increaseInValue(number1);
    }

}
