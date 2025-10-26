package by.homework.lessons.task9;

public class Bird extends Animal {

    private String species;
    private double maxFlyHeight;

    @Override
    public void play() {
        System.out.println(species + " plays");
    }

    @Override
    public void makeSound() {
        System.out.println(species + " makes sound");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bird{");
        sb.append("super=").append(super.toString());
        sb.append("species='").append(species).append('\'');
        sb.append(", maxFlyHeight=").append(maxFlyHeight);
        sb.append('}');
        return sb.toString();
    }

    public void sing() {
        System.out.println(species + " singing");
    }

    public void peck() {
        System.out.println(species + " pecking");
    }

    public void hatch() {
        System.out.println(species + " hatching");
    }

    public Bird(
            String preferableFood,
            int lifetime,
            String color,
            int id,
            String species,
            double maxFlyHeight
    )
    {
        super(preferableFood, lifetime, color, id);
        this.species = species;
        this.maxFlyHeight = maxFlyHeight;
    }
}
