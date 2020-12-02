package homeWork;

public class HomeWork1_1 {
    public static void main(String[] args) {
        int a = 42;   // 101010
        int b = 15;   // 101010
        System.out.println(Integer.toBinaryString(~a));   // 11010101 (-43)
        System.out.println(Integer.toBinaryString(~b));   // 11110000 (-16)
        System.out.println(Integer.toBinaryString(a&b));  // 1010  (10)
        System.out.println(Integer.toBinaryString(a|b));  // 101111  (47)
        System.out.println(Integer.toBinaryString(a^b));  // 100101  (37)
        int c = (a << 1);
        int d = (b << 1);
        System.out.println(Integer.toBinaryString(c));    // 1010100 (84)
        System.out.println(Integer.toBinaryString(d));    // 11110 (30)
        int i = (a >> 1);
        int f = (b >> 1);
        System.out.println(Integer.toBinaryString(i));    // 10101 (21)
        System.out.println(Integer.toBinaryString(f));    // 111 (7)

        int a1 = -42;   // 11010110
        int b1 = -15;   // 11110001
        System.out.println(Integer.toBinaryString(~a1));   // 101001 (41)
        System.out.println(Integer.toBinaryString(~b1));   // 1110 (14)
        System.out.println(Integer.toBinaryString(a1&b1));  // 11010000  (-48)
        System.out.println(Integer.toBinaryString(a1|b1));  // 11110111  (-9)
        System.out.println(Integer.toBinaryString(a1^b1));  // 100111  (39)
        int c1 = (a1 << 1);
        int d1 = (b1 << 1);
        System.out.println(Integer.toBinaryString(c1));    // 10101100 (-84)
        System.out.println(Integer.toBinaryString(d1));    // 11100010 (-30)
        int i1 = (a1 >> 1);
        int f1 = (b1 >> 1);
        System.out.println(Integer.toBinaryString(i1));    // 11101011 (-21)
        System.out.println(Integer.toBinaryString(f1));    // 11111000 (-8)

        double a2 = 42.5;
        // System.out.println(Integer.toBinaryString(a2)); //  ошибка "incompatible types: possible lossy conversion from double to int"
        // System.out.println(Integer.toBinaryString(~a2)); // ошибка "bad operand types"
    }
}
