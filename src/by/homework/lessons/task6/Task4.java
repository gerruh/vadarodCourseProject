package by.homework.lessons.task6;

import java.util.Arrays;

/*
Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
Вывести полученный массив. Выполнить с помощью цикла for
 */

public class Task4 {

    public static void main(String[] args) {
        run();
    }

    //легко
    public static void run() {
        int [] arr = {3,2,5,1,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
