package by.homework.lessons.task6;

/*
 Создать массив из 5 чисел и заполните этот массив вручную.
 Создайте второй массив с размерностью больше на 1 чем первый массив.
 Необходимо скопировать первый массив со всеми значениями во второй массив.
  Последний элемент во втором массиве пусть будет 0.
  Выведите второй массив в консоль с помощью цикла for each.
 */

public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int [] arr = new int[5];
        int [] arr2 = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
