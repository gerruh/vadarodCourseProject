package by.homework.lessons.task11;

class RobotBuilder implements RobotEngineer {
    private String model;
    private int powerConsumption;
    private String manufacturerCountry;
    private String buildingDevice;
    private String material;
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-строитель " + model + " включен");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-строитель " + model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-строитель " + model + " строит здание с помощью " + buildingDevice);
        } else {
            System.out.println("Робот-строитель выключен! Включите его сначала.");
        }
    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println("Робот-строитель " + model + " создает бетон из " + material);
        } else {
            System.out.println("Робот-строитель выключен! Включите его сначала.");
        }
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public RobotBuilder(String model, int powerConsumption, String manufacturerCountry, String buildingDevice, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.buildingDevice = buildingDevice;
        this.material = material;
        this.isOn = false;
    }

}
