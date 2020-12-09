package homeWork2loops;
import java.util.Scanner;

class HomeWork_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String number = scanner.nextLine();
        int a = Integer.parseInt(number);
        int y = 1;
        String resultString = String.valueOf(y);
        for (int i = 2; i <= a; i++) {
            resultString = resultString + " * " + i;
            y = i * y;
        }
        System.out.println(resultString + " = " + y);
    }
}