package ss3;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        System.out.println("số tiền: ");
        do {
            money = Integer.parseInt(sc.nextLine());
            if (money < 0) {
                System.out.println("vui lòng nhập lại số lớn hơn 0: ");
            } else {
                break;
            }
        } while (true);
        int month ;
        System.out.println("số tháng gửi: ");
        do {
           month = Integer.parseInt(sc.nextLine());
            if (month <= 0 || month > 12){
                System.out.println("vui lòng nhập lại tháng: ");
            }else {
                break;
            }
        }while (true);
        System.out.println("lãi xuất: ");
        int interest = Integer.parseInt(sc.nextLine());

        int interestBank = money * (interest / 12) * month;
        System.out.println("tiền lãi ngân hàng là: " + interestBank);

    }
}
