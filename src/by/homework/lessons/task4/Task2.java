package by.homework.lessons.task4;
import java.util.Scanner;

/*
На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
 (используйте оператор % для проверки деления без остатка)
 */

public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int [] nums = {a,b,c};

        for (int num : nums) {
            if (num % 2 == 0 && num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}