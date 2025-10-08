package by.practice.lessons.task1;
import java.util.Scanner;

//Введите x,y,z. К числу x прибавьте y, число y умножьте на z.
//Используйте операции присваивания. Результат выведите в косноль

public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        y*=z;
        System.out.println(y);

        x+=y;
        System.out.println(x);
    }
}