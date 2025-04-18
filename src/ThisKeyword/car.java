package ThisKeyword;

public class car {
    //this keyword refers to the instance variable
    //lets understand this with constructors
    String model;
    int year;//this is instance variable
    //constructor
    car(String model){
        this.model=model;//here we can understand about the this keyword
        //we use this when we have same name for the variable and the parameter
        //this.model referes to the instance variable
    }
    car(int y){
        year = y;

    }


    public static void main(String[] args) {
        //create the obj
        car Car=new car("BMW");
        System.out.println(Car.model);
        car Car1=new car(2929);
        System.out.println(Car1.year);



    }
}
