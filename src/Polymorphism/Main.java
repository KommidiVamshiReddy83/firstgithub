package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Pig pig=new Pig();
        Animal animal=new Animal();
        Dog dog=new Dog();
//here the method name is same and it has the different forms ---this is called the polymorphism
        pig.animalsound();
        animal.animalsound();
        dog.animalsound();
    }
}
