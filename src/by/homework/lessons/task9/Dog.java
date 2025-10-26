package by.homework.lessons.task9;

public class Dog extends Animal {

    private String name;
    private String breed;
    private double averageWeight;

    @Override
    public void play() {
        System.out.println(name + " plays");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes sound");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("super=").append(super.toString());
        sb.append("name='").append(name).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", averageWeight=").append(averageWeight);
        sb.append('}');
        return sb.toString();
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    public void bite() {
        System.out.println(name + " bites");
    }

    public void run() {
        System.out.println(name + " runs");
    }

    public void jump() {
        System.out.println(name + " jumps");
    }

    public Dog(
            String preferableFood,
            int lifetime,
            String color,
            int id,
            String name,
            String breed,
            double averageWeight
    ) {
        super(preferableFood, lifetime, color,id);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }
}
