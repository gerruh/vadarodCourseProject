package by.homework.lessons.task6;

/*
Создать массив вручную. Заменить максимальный и минимальный элемент массива.
Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
 */

public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int [] arr = new int[5];
        arr[0] = -1000;
        arr[arr.length-1] = 1000;

        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[0]);
    }
}
