package by.homework.lessons.Task10;

public class Animal {
    private String color;
    private int lifetime;
    private String preferableFood;
    private int id;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("color='").append(color).append('\'');
        sb.append(", lifetime=").append(lifetime);
        sb.append(", preferableFood='").append(preferableFood).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    public void play() {
        System.out.println("Animal playing");
    }

    public int getId() {
        return id;
    }

    public Animal(String preferableFood, int lifetime, String color, int id) {
        this.preferableFood = preferableFood;
        this.lifetime = lifetime;
        this.color = color;
        this.id = id;
    }
}
