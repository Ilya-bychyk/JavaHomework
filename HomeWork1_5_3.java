package homeWork;
import java.util.Scanner;
public class HomeWork1_5_3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String newName = name.nextLine();
        public static String (String[] args)  {
            switch (newName) {
                case "Вася":
                    return "Привет! \n" + " Я тебя так долго ждал";
                case "Анастасия":
                    return "Я тебя так долго ждал";
                default:
                    return "Добрый день, а вы кто?";
            }
        }
    }
}