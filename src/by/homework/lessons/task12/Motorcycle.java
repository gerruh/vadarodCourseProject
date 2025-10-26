package by.homework.lessons.task12;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(String name, Integer emissions, boolean hasSidecar) {
        super(name, emissions);
        this.hasSidecar = hasSidecar;
    }
}
