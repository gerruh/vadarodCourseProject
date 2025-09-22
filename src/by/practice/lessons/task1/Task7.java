package by.practice.lessons.task1;
import java.util.Scanner;

/*
На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
 */

public class Task7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String result = a%3 == 0 ? "Число делится на 3" : "Число не делится на 3";

        System.out.println(result);
    }
}