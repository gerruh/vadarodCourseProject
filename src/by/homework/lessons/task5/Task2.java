package by.homework.lessons.task5;
import java.util.Scanner;

/*
Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа
до другого. (Используйте цикл while)
.Подсказка. До цикла объявите переменную int sum=0.
В самом цикле перезаписывайте в эту переменную сумму чисел.
 */

public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        while (a <= b) {
             sum += a;
             a++;
        }

        System.out.println(sum);
    }
}