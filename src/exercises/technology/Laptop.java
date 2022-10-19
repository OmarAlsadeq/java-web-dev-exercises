package exercises.technology;

public class Laptop extends Computer {

    private double weight;

    public Laptop(int ram, int storage, boolean hasKeyboard, double weight) {
        super(ram, storage, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }
}
