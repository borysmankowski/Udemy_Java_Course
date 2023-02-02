package abstract_classes.animals;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Ommmom ");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing ");
    }


}
