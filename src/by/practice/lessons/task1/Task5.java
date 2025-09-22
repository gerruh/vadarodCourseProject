package by.practice.lessons.task1;
import java.util.Scanner;

/*
Ввести числа a и b с консоли.
Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
 */

public class Task5 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            int c = a-b;
            System.out.println(c);
        }
        else if (a==b){
            System.out.println(a+b);
        }
        else {
            System.out.println(b-a);
        }
    }
}