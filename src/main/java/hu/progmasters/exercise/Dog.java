package hu.progmasters.exercise;

public class Dog {
    private String name;
    private Shepherd owner;
    private Herd guardedHerd;
    private int energy;

    public Dog(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public void countSheeps() {
        reduceEnergy(guardedHerd.getSheepCount());
    }

    public void reduceEnergy(int energyLoss) {
        energy -= energyLoss;
        if (energy < 0) {
            energy = 0;
        }
        if (energy == 0) {
            guardedHerd.setGuarded(false);
        }
    }

    public Herd getGuardedHerd() {
        return guardedHerd;
    }

    public void guardHerd(Herd herd) {
        if (guardedHerd != null) {
            guardedHerd.setGuarded(false);
        }
        guardedHerd = herd;
        if (energy > 0) {
            herd.setGuarded(true);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shepherd getOwner() {
        return owner;
    }

    public void setOwner(Shepherd owner) {
        this.owner = owner;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
