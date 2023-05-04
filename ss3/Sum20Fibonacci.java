package ss3;

public class Sum20Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;
        int sum = 0;

        for (int i = 3; i <= 20; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            sum = sum + number3;
        }
        System.out.println("tổng 20 số fibonacci đầu tiên là: " + sum);
    }
}

