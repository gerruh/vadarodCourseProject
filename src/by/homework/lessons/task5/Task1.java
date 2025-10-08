package by.homework.lessons.task5;

/*
Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
 */

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}