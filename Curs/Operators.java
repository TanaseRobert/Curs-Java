package Curs;

public class Operators {
    public static void main(String[] args) {

        /*
        Operatori:
        -> aritmetici: +, -, *, /, %
        -> de comparare: <>, ==, !=, <=, >=
        -> logici: &&, ||, !
        */

        int a = 3;
        int b = 5;
        System.out.println(a % b);                              // 3
        System.out.println(a != b);                             // true
        System.out.println(a % b == 3 && a * b == 20);          // true && false -> false
        System.out.println(a / b == 0 || a > b);                // true || false -> true

    }
}
