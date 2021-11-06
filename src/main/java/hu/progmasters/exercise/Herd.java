package hu.progmasters.exercise;

public class Herd {
    private int sheeps;
    private boolean guarded;
    private boolean wellFed;

    public Herd(int sheeps) {
        this.sheeps = sheeps;
        this.guarded = false;
        this.wellFed = false;
    }

    public void grow() {
        int multiplier = wellFed ? 120 : 110;
        sheeps = sheeps * multiplier / 100;
    }

    public String bleat() {
        if (sheeps == 0) {
            return "";
        }
        String baas = "Baa";
        int extraBaas = (int) Math.log10(sheeps);
        for (int i = 0; i < extraBaas; i++) {
            baas += ", baa";
        }
        return baas;
    }

    public int getSheepCount() {
        return sheeps;
    }

    public void setSheepCount(int sheeps) {
        this.sheeps = sheeps;
    }

    public void decreaseSheepCount(int sheeps) {
        this.sheeps -= sheeps;
        if (this.sheeps < 0) {
            this.sheeps = 0;
        }
    }

    public boolean isGuarded() {
        return guarded;
    }

    public void setGuarded(boolean guarded) {
        this.guarded = guarded;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }
}
