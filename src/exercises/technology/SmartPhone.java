package exercises.technology;

public class SmartPhone extends Computer{
    private int numOfSelfies;

    public SmartPhone(int ram, int storage, boolean hasKeyboard, int numOfSelfies) {
        super(ram, storage, hasKeyboard);
        this.numOfSelfies = numOfSelfies;
    }

    public void takeSelfie(){
        this.numOfSelfies = this.numOfSelfies + 1;
    }

    public int getNumOfSelfies(){
        return this.numOfSelfies;
    }
}
