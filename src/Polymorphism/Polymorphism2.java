package Polymorphism;

import java.lang.classfile.Superclass;

public class Polymorphism2 extends Polymorphism1{
    //create the method with name myMethodOverRiding as we created in class Polymorphism
    //method name should same in both the superclass (paraent) and subclass (child)
    void myMethodOverRiding(){
        System.out.println("this is 2nd overriding");
    }
    public static void main(String[] args) {
        //create an abject for class Polymorphism2
        Polymorphism2 polymorphism2=new Polymorphism2();
        polymorphism2.myMethodOverRiding();
        //here the method has beeen replaced (overRidden)

    }
}
