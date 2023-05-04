package ss4;

public class Display {
    public static int addNumber(){
        int firsNum = 4;
        int secondNum = 8;
        int result = firsNum + secondNum;
        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        result = addNumber();
        System.out.println(result);
    }
}
