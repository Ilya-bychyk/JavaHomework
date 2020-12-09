package homeWork2loops;
import java.util.Scanner;

class HomeWork_2_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String number = scanner.nextLine();
        int a = Integer.parseInt(number);
        Integer aInt = a;
        String str1 = aInt.toString();
        String resultString = String.valueOf(str1);

      //  for (int i = 2; i <= a; i++) {
        //  resultString =resultString + " * " + i;
        //   y = i * y;
        System.out.print(" "+ resultString);
        }
    }
