package ss2;

import java.util.Scanner;

public class LyThuyet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        // ------------------------ câu lệnh điều khiển ----------------------
        // định nghĩa: là câu lệnh dùng để thay đổi luồng thực thi của chương trình
        // 1. câu lệnh điều kiện
        // có 2 loại : if , else và switch, case
        // I. if   // kí hiệu:  và : && ; hoặc:||

        // && thì tất cả điều kiện phải đúng ; || chỉ cần 1 điều kiện đúng
        // gồm 4 loại: 1.if thường ; 2. if bậc thang ; 3. if lồng nhau ; 4. if đủ
        // II. switch case
        // nếu điều kien trên 3 thì dùng switch case còn bé hơn hoặc bằng 3 thì dùng if else
        // lưu ý: () dùng để đặt điều kiện ; {} dùng để thực hiện câu lệnh
        System.out.println("nhập vào 1 ten: ");
//        int age = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

//        if(age >= 0){
//            if(age>=18){
//                System.out.println("ban du dieu kien de nhap hoc");
//            }else if(age==0){
//                System.out.println("bạn còn quá nhỏ tuổi");
//            }else{
//                System.out.println("bạn ko đủ điều kiện");
//            }
//        }else {
//            System.out.println("tuoi ko the so am");
//        }

        switch (str) {
            case "duy":
                System.out.println("ban này đẹp trai");
                break;
            case "danh":
                System.out.println("ban con qua nho");
                break;
            case "hai":
                System.out.println("bị bê đê");
                break;

            default:
                System.out.println("aslo");
                break;
        }
    }
}
