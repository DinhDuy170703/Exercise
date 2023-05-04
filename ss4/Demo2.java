package ss4;

import java.util.Scanner;

public class Demo2 {

    // bài 1:
//    public static void tinhTong (int number){
//        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static int tinhTong1 (int number){
//        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào số nguyên: ");
//        int number = Integer.parseInt(sc.nextLine());
//        tinhTong(number);
//        System.out.println(tinhTong1(number));
//   Bài 2:
    public static void fibonacci(int n){
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        for (int i = 3; i <= n; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            System.out.println(number3);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int n = Integer.parseInt(sc.nextLine());
        fibonacci(n);
    }
}

