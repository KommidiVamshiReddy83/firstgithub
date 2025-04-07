package Encapsulation;
//get set
//make sensitive data hidden from users
//declare class variables/attributes as private
//provide the get and set methods to access and update the value of a private variable/attribute

public class Encapsulation3 {
    private int age;
    private String name;

    //setter method
    public void setage(int age) {
        this.age = age;
    }

    //getter method
    public int getAge() {
        return age;
    }

    //setter method for String name
    public void setName(String Name) {
        name = Name;
    }

    //getter method for Sting name
    public String getname() {
        return name;
    }


}