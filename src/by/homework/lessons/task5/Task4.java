package by.homework.lessons.task5;
import java.util.Scanner;

/*
Ввести число с консоли, которое не заканчивается на 0.
Вывести чётные и нечётные числа через while and if. Использовать оператор %.
 */

public class Task4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 10 == 0) {
            System.out.println("Число " + a + " имеет 0 на конце");
            return;
        }

        while (a > 0) {
            int b = a%10;

            if (b%2 == 0) {
                System.out.println(b + " - Чётное число");
            } else {
                System.out.println(b + " - Нечётное число");
            }
            a/=10;
        }
    }
}