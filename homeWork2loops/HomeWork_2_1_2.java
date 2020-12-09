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
        }
        for (int i = 0; i < intArray.length; i++) {
            int intItem = intArray[i];
            if (i == 0) {
                System.out.print(intItem);
            } else {
                System.out.print(" * " + intItem);
            }
        }
        int resultValue = 1;
        for (int intItem : intArray) {
            resultValue *= intItem;
        }
        System.out.println(" = " + resultValue);
    }
}