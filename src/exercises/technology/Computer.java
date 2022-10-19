package exercises.technology;

import java.awt.dnd.DragSourceMotionListener;

public class Computer extends AbstractEntity{

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increasesRAM(int n) {
        this.ram = ram + n;
    }
    public void increasesStorage(int x){
        this.storage = storage + x;
    }
}
