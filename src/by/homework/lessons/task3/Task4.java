package by.homework.lessons.task3;

/*
Даны значения: x=5; y=2; c=x*y; Ра
составьте операции инкремента декремента так,
чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1
Выведите полученные значения в консоль.
 */

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        byte x = 5;
        byte y = 2;
        int c = ++x*y--;
        System.out.println("Значение x: " + x);
        System.out.println("Значение y: " + y);
        System.out.println("Значение с: " + c);
    }
}