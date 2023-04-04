package ss2.Advanced;

import java.util.Scanner;

public class DisplayNumbersInLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 số bất kì:");
        int number = Integer.parseInt(sc.nextLine());

        switch (number) {
            case 0:
                System.out.println("số không");
                break;
            case 1:
                System.out.println("số một");
                break;
            case 2:
                System.out.println("số hai");
                break;
            case 3:
                System.out.println("số ba");
                break;
            case 4:
                System.out.println("số bốn");
                break;
            case 5:
                System.out.println("số năm");
                break;
            case 6:
                System.out.println("số sáu");
                break;
            case 7:
                System.out.println("số bảy");
                break;
            case 8:
                System.out.println("số tám");
            case 9:
                System.out.println("số chín");
                break;
            case 10:
                System.out.println("số mười");
                break;
            default:
                System.out.println("bố mày chịu");
        }
    }
}
