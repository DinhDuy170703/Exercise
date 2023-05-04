package ss4;

import java.util.Scanner;

public class Square {
    public static int squareNumber(int number1){
        int square = number1 * number1;
        return square;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bất kì: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println(squareNumber(number1));
    }

}
