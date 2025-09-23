package by.homework.lessons.task5;
import java.util.Scanner;

/*
Ввести число с консоли, которое не заканчивается на 0.
Вывести число в обратном порядке. Использовать оператор %.
 */

public class Task3 {

    public static void main(String[] args) {}

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        if (a % 10 == 0) {
            System.out.println("Число " + a + " имеет 0 на конце");
            return;
        }

        while (a > 0) {

            int b = a%10;
            sum *= 10;
            sum += b;
            a /= 10;
        }

        System.out.println(sum);
    }
}