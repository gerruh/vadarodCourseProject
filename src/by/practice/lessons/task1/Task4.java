package by.practice.lessons.task1;

/*
Даны значения: x=5; y=2; c=x*y; Расставьте операции инкремента декремента так,
чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
 */

public class Task4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int x = 5;
        int y = 2;
        int c = x++*y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
    }
}
