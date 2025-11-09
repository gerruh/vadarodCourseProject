package by.homework.lessons.task12;

class Vehicle {
    private String name;
    private Integer emissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmissions() {
        return emissions;
    }

    public void setEmissions(Integer emissions) {
        this.emissions = emissions;
    }

    public Vehicle(String name, Integer emissions) {
        this.name = name;
        this.emissions = emissions;
    }
}
