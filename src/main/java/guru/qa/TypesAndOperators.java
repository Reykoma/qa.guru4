package guru.qa;

public class TypesAndOperators {

    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1   самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0; // 64 bit   самый используемый (если просто хранить, но не использовать арифметику)

    char aChar = 'k';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=

        // && (&)
        // || (|)
        // !

        byte b = 5;
        int i = 9, k = 91;
        long l = 30_000_000_000L;

     // b = b + 150; переполнение типа byte
    //  k  = k - 1000000000000000000000000; переполнение типа int
        System.out.println((k + i) > (i - k));
        System.out.println(k * i);
        System.out.println(k / i);
        System.out.println(k % i);
        System.out.println(i += k); // int + long

        System.out.println(l + k);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(b > i);
        System.out.println(k != i);

        float f = 0.5F;
        double d = 5.84;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char c = 'q', t = 'a';
        boolean bol = false;

        System.out.println(c + t); // char + char
        System.out.println(!bol);
    }

}
