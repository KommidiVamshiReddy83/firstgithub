package SuperKeyword;

public class Dog extends animal{



    Dog(String name){
        super(name);//calling the parent classs constructor

    }
    void display(){
        System.out.println("the dog name is "+name);
    }
}
