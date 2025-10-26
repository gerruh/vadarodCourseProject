package by.homework.lessons.task12;

class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean isEntryPermitted() {
        if (vehicle.getEmissions() > 100) {
            return false;
        } else {
            return true;
        }
    }

    public void displayInfo() {
        System.out.println("Транспортное средство: " + vehicle.getName());
        System.out.println("Количество выбросов: " + vehicle.getEmissions());
        System.out.println("Въезд в гараж разрешён: " + (isEntryPermitted() ? "ДА" : "НЕТ"));
        System.out.println("---");
    }
}
