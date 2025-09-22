package by.practice.lessons.task1;

//Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x

public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int x = (213+258)/(217-60);
        System.out.println(x);
    }
}