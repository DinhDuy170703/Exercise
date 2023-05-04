package ss4;

import java.util.Scanner;

public class Integer {
    public static boolean checkNumber(int number){
        if(number > 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int number = java.lang.Integer.parseInt(sc.nextLine());
        if(number==0){
            System.out.println("số này không âm ko dương ");
        }else if(number != 0){
            System.out.println(checkNumber(number));
        }
    }


}
