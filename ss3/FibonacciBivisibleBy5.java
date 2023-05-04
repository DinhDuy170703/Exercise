package ss3;

public class FibonacciBivisibleBy5 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        for (int i = 3; i <= 20; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            System.out.println(number3);

            if (number3 % 5 == 0) {
                System.out.println("số đầu tiên chia hết cho 5 là:"  + number3);
                break;
            }
        }
    }
}


