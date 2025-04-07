package Polymorphism;
//with method overloading---should be in same class name
//----should be within same class
//----different parameters,different order


public class Polymorphism1 {
    //here we will create the methods with same names but with different parameters,different order of parameters
    void methodOverloading(){
        System.out.println("this is without parameters");
    }
    void methodOverloading(int a){
        System.out.println("this is with single type");
    }
    void methodOverloading(int a,String b){
        System.out.println("this is with multiple types");
    }
    void methodOverloading(String a,int b){
        System.out.println("this is with different order of types");
    }
     //here the method-methodOverloading is existing in many forms this is called as compile time polymorphism achieved by method overloading
//next we will have method Overriding
    //same names
    //in different class
    //same parameters,same order of parameters
    //Must be follow the inheritance
    //here lets we take one method with name myMethodOverRiding() and perform the method overriding
    void myMethodOverRiding(){
        //this method is without parameters
        System.out.println("this is 1st methodOverRiding");
        //need to take another classs and perform inheritance to achieve MethodOVerRiding
    }
}
