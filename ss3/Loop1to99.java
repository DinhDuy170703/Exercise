package ss3;

public class Loop1to99 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 99) {
                System.out.println("đã hoàn thành");
            }
        }
    }
}
