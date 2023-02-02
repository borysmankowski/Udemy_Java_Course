package abstract_classes.animals;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Husky");
        dog.breathe();
        dog.eat();

        System.out.println();

        Parrot parrot = new Parrot("Ringneck");
        parrot.breathe();
        parrot.eat();

        System.out.println();

        Pengiun pengiun = new Pengiun("Emperor");
        pengiun.fly();

    }


}
