package by.homework.lessons.task3;

/*
Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе,
присвоить числу c значение 10. (тернарный оператор)
 */

public class Task3 {
    public static void main(String[] args) {}

    public static void run() {
        byte a = 35;
        byte b = 65;
        int c = (a > b) ? 5 : 10;

        System.out.println(c);
    }
}