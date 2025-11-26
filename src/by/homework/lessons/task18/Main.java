package by.homework.lessons.task18;

public class Main {
    public static void main(String[] args) {
        startTwoCars();
        startThreeCars();
    }

    private static void startTwoCars() {
        AutoThreads car1 = new AutoThreads("BMW", "1111-AA", 500);
        AutoThreads car2 = new AutoThreads("Audi", "2222-BB", 700);

        car1.start();
        car2.start();
    }

    private static void startThreeCars() {
        AutoThreads first = new AutoThreads("Lada", "0000-LL", 600);

        AutoThreads second = new AutoThreads("Toyota", "3333-CC", 400);
        AutoThreads third = new AutoThreads("Mazda", "4444-DD", 300);

        first.start();

        try {
            first.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        second.start();
        third.start();
    }
}

