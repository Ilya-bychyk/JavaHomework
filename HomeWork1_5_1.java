package homeWork;
import java.util.Scanner;
public class HomeWork1_5_1 {
    public static void main(String[] args) {
        String name1 = "Вася";
        String name2 = "Анастасия";
        String name3 = null;
        Scanner name = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String newName = name.nextLine();
        if (newName.equals(name1)) {
            System.out.print("Привет! \n" + " Я тебя так долго ждал");
            return;
        }
        if (newName.equals(name2)) {
            System.out.print("Я тебя так долго ждал");
            return;
        }
        System.out.println("Добрый день, а вы кто?");
    }
}
