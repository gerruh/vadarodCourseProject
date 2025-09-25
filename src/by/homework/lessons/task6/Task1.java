package by.homework.lessons.task6;

/*
Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль
(выводите через цикл for each). Замените каждый элемент с нечётным индексом на ноль.
Выведите полученный массив в консоль через цикл for each
 */

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    static void run() {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int n: arr) {
            System.out.println(n);
        }
    }
}
