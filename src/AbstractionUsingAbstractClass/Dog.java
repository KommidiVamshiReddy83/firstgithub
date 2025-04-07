package AbstractionUsingAbstractClass;

public class Dog extends Animal {
    @Override
    void name() {
        System.out.println("the dog name is ricky");

    }

    @Override
    void sound() {
        System.out.println("the makes bow bow sound");
    }
}
