package by.homework.lessons.task4;
import java.util.Scanner;

/*
На вход даны 3 числа. Вывести в консоль только четные числа
 */

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] numbers = {a,b,c};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}