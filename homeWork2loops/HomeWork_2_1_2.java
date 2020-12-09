package homeWork2loops;
import java.util.Scanner;

class HomeWork_2_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String number = scanner.nextLine();
        char[] charArray = number.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
            for (int i = 0; i < charArray.length; i++)
        }
    }
}