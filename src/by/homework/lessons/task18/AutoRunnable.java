package by.homework.lessons.task18;

public class AutoRunnable implements Runnable {

    String name;
    String number;
    int stopTime;

    public AutoRunnable(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    private void drive() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " (" + number + ") едет... шаг " + i);
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " закончила движение!");
    }

    @Override
    public void run() {
        drive();
    }
}

