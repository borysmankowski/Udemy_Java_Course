package abstract_classes.animals;

public class Pengiun extends Bird{

    public Pengiun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that lets go for a swim");
    }
}
