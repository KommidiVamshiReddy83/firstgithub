package Inheritance;

public class Dog extends Animal{
    //method
    public void dogMethod(){
        System.out.println("the method of the dog");
    }
    //default constructor
    public Dog(){
        //super();
        System.out.println("the default constructor of dog");
    }
    //parameterised constructor
    public Dog(String name,int age){
        super(name,age);

        System.out.println("the name of dog is "+name+"  and the age is " +age);
    }
}
