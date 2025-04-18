package Inheritance;

public class Animal {
    String animalName;
    int age;
    //method
    public void nameMethod(){
        System.out.println("the name of animal");
    }
    //constructor default
    public Animal(){
        //super();
        System.out.println("the default constructor of animal");
    }
    //constructor with parameters
    public Animal(String animalName,int age){
        System.out.println("the name of animal is "+animalName+"  age is "+age);

    }
}
