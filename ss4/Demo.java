package ss4;

import java.util.Scanner;

public class Demo {

        public static void sum(int number1 , int number2){
        int sum = number1 + number2;
        System.out.println(sum);
    }
    public static void hieu(int number1 , int number2){
        int hieu = number1 - number2;
        System.out.println(hieu);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số thứ 2: ");
        int number2 = Integer.parseInt(sc.nextLine());
       sum(number1,number2);
        hieu(number1,number2);
    }
}
