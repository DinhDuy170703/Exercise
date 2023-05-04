package ss3;

public class First30NumbersAreDivisibleBy7 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 210) {
            i++;
            if (i % 7 == 0) {
                System.out.println("tổng 30 số đầu tiên chia hết cho 7 là: " + i);
            }

        }
    }
}