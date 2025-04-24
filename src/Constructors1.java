public class Constructors1 {
    int x;//class attribute
    public Constructors1(){//here we are creating a constructors1 which store the information of the variable
        //here we will give the intial value for the variable
        x=5;
    }

    public static void main(String[] args) {
        Constructors1 myobj1=new Constructors1();//here Constructors1() is constructor it is defined at the time of object creation
        //Constructors1() this will call the constructor
        System.out.println(myobj1.x);

    }
}
