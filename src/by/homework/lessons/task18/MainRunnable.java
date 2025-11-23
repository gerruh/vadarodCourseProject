package by.homework.lessons.task18;

public class MainRunnable {
    public static void main(String[] args) {

        Runnable r1 = new AutoRunnable("Ford", "5555-FF", 500);
        Runnable r2 = new AutoRunnable("Honda", "6666-GG", 700);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

