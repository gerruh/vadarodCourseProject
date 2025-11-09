package by.homework.lessons.task11;

class RobotSapper implements RobotEngineer {
    private String model;
    private int powerConsumption;
    private String deminingDevice;
    private String material;
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-сапёр " + model + " включен");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-сапёр " + model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-сапёр " + model + " обезвреживает мины с помощью " + deminingDevice);
        } else {
            System.out.println("Робот-сапёр выключен! Включите его сначала.");
        }
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-сапёр " + model + " проходит специальный ремонт для сапёров");
        System.out.println("Проверка системы безопасности...");
        System.out.println("Калибровка датчиков...");
        System.out.println("Ремонт завершен успешно!");
    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println("Робот-сапёр " + model + " создает приспособление для разминирования из " + material);
        } else {
            System.out.println("Робот-сапёр выключен! Включите его сначала.");
        }
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public RobotSapper(String model, int powerConsumption, String deminingDevice, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.deminingDevice = deminingDevice;
        this.material = material;
        this.isOn = false;
    }
}
