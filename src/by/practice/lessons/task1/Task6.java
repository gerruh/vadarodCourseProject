package by.practice.lessons.task1;
import java.util.Scanner;

/*
Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b
 */

public class Task6 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b && b!=0) {
            System.out.println(a/b);
        } else if (a!=0) {
            System.out.println(b/a);
        } else {
            System.out.println(a+b);
        }
    }
}