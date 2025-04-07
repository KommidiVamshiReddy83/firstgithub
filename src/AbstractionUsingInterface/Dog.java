package AbstractionUsingInterface;

public class Dog implements Animal,Birds{
    @Override
    public void sound() {
        System.out.println("the dog makes bow bow sound");
    }

    @Override
    public void name() {
        System.out.println("the dog name is Ricky");

    }

    @Override
    public void fly() {
        System.out.println("the birds will fly");

    }


}
