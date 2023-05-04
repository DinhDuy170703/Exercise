package ss3;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i =1000;i > 0;i--){
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(i);
//        }
//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//      }
//        int number;
//        System.out.println("nhap vao 1 so: ");
//        do {
//            number = Integer.parseInt(sc.nextLine());
//            if (number < 10){
//                System.out.println("duy");
//                break;
//            }else {
//                System.out.println("moi nhap lai so lon hon 10");
//            }
//        }while (true);
//        System.out.println("nhap so nguyen");
//        int number = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < number; i++ ) {
//            if(i % 2 != 0){
//                System.out.println(i);
//            }
//        }
        int count =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("danh bê đê");
                count++;
            }
            }
        System.out.println(count);
        }
    }
