package ss2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 tên : ");
        String name = sc.nextLine();

        switch (name){
            case "duy":
                System.out.println("bạn này đẹp trai ");
                break;
            case "tài":
                System.out.println("bạn này bị bê đê");
                break;
            case "bin":
                System.out.println("bạn này bị bệnh đao");
                break;
            case "linh":
                System.out.println("bạn này dễ thương");
                break;
        }
    }
}
//    public static void main(String[] args) {
        //  bài 1:nhập vào 1 số kiểm tra số đó có phải 4 chữ số hay không
        // gợi ý: và trong code là && , hoặc trong code là ||
//        Scanner sc = new Scanner(System.in);
//        System.out.println("cho nhập số có 4 chữ số: ");
//        int number1 = Integer.parseInt(sc.nextLine());
//        if(number1>999 && number1<10000){
//            System.out.println("đây là 4 chữ số");
//        }else{
//            System.out.println("đây k phải 4 chữ số");
//        }

        // bài 2: nhập vào 1 tên kiểm tra xem có đúng là danh hoặc duy hay không
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập tên:");
//        String name = sc.nextLine();
//        if (name.equals("danh") || name.equals("duy")) {
//            System.out.println("bị bê đê");
//        }
//        else if (name.equals("duy")) {
//            System.out.println("cũng bê đê");
//        }
//         else {
//            System.out.println("no");
//        }
//    }
//}
