package by.homework.lessons.task11;

class RobotCook implements Robot {

    private String model;
    private int powerConsumption;
    private String manufacturerCountry;
    private String cookingDevice;
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-повар " + model + " включен");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-повар " + model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-повар " + model + " готовит еду с помощью " + cookingDevice);
        } else {
            System.out.println("Робот-повар выключен! Включите его сначала.");
        }
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public RobotCook(String model, int powerConsumption, String manufacturerCountry, String cookingDevice) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.cookingDevice = cookingDevice;
        this.isOn = false;
    }
}
