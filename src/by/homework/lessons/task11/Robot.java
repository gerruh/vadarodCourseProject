package by.homework.lessons.task11;

interface Robot {
    default void repairRobot() {
        System.out.println("Робот проходит стандартный ремонт");
    }

    void turnOn();
    void turnOff();
    void uniquePossibility();
}