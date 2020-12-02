package homeWork;

public class HomeWork1_2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println(5 + (2d / a));    // 2.1 Результат 5,25. 2d - объявили тип данных дабл
        System.out.println((5d + b) / a);    // 2.2 Результат 0,875. 5d - объявили тип данных дабл
        int a1 = 8;
        int b1 = 2;
        System.out.println(5f + b1++ / a1);     // 2.3 Результат 5. необходимо ввести переменную b, так как постинкремент работает с переменными, а не со значениями
        int a2 = 8;
        int b2 = 2;
        System.out.println((5 + (double) b2++) / --a2); // 2.4 Результат 1.0, выполнили приведение типа данных
        int a3 = 8;
        int b3 = 2;
        System.out.println((double) (5 * 2 >> b3++) / --a3);   // 2.5 Результат 0.2857142857142857. Побитовый сдвиг имеет низший приоритет
        int a4 = 8;
        int b4 = 2;
        System.out.println((5 + 7 > 20 ? 68 : (double) ((22 * 2 >> b4++)) / --a4)); // 2.6 Результат 1.5714285714285714. выполнялось значение False, данную переменную привели к double
        int a5 = 8;
        int b5 = 2;
        System.out.println(((5 + 7) > 20) ? (68 >= 68) : (double) ((22 * 2) >> b5++) / --a5); // 2.7 Результат 1.5714285714285714. выполнялось значение False, данную переменную привели к double
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // 2.8 Результат false - так как "12 * 12 <= 119" - false
        System.out.println(true && false); // 2.9 Результат false - так как "false" - false
    }
}
