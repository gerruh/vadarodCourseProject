package by.homework.lessons.task12;

class Car extends Vehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Car(String name, Integer emissions, int doors) {
        super(name, emissions);
        this.doors = doors;
    }
}