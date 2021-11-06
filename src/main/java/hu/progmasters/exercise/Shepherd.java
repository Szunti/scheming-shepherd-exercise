package hu.progmasters.exercise;

public class Shepherd {
    private String name;
    private Herd herd;
    private Dog dog;

    private int cookCount = 0;

    public Shepherd(String name, Herd herd) {
        this.name = name;
        this.herd = herd;
    }

    public Shepherd(String name) {
        this(name, new Herd(0));
    }

    public void adoptDog(Dog dog) {
        Shepherd currentOwner = dog.getOwner();
        if (currentOwner != null) {
            currentOwner.setDog(null);
        }
        this.dog = dog;
        dog.setOwner(this);
        dog.guardHerd(herd);
        if (dog.getEnergy() > 0) {
            herd.setGuarded(true);
        }
    }

    public boolean hasDog() {
        return dog != null;
    }

    public void cook() {
        cookCount++;
        if (cookCount % 3 == 0) {
            cookSheep();
        }
    }

    private void cookSheep() {
        if (herd.getSheepCount() > 0) {
            herd.decreaseSheepCount(1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Herd getHerd() {
        return herd;
    }

    public void setHerd(Herd herd) {
        this.herd = herd;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
