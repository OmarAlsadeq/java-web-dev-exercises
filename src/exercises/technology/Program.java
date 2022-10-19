package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(800, 8, true, 4.0);
        SmartPhone myPhone = new SmartPhone(32, 4, false, 365);

        System.out.println(myLaptop.getId());
        System.out.println(myPhone.getId());

        if(myLaptop.isClunky()) {
            System.out.println("My Laptop is so heavy");
        }
        else {
            System.out.println("My laptop is so light");
        }
        myPhone.takeSelfie();

        System.out.println("I just took a selfie! I now have " + myPhone.getNumOfSelfies() + " selfies on my phone!");
    }
}
