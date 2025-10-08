package by.homework.lessons.task3;

/*
x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения,
чтобы результат не изменился. x=8; y=9; z=12; (операции присваивания,
нужно просто написать по-другому)
 */

public class Task2 {
    public static void main(String[] args) {}

    public static void run() {
        byte x = 8;
        byte y = 9;
        byte z = 12;

        x+=5;
        y*=8;
        z-=6;

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}