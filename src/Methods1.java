public class Methods1 {
    static void myMethod(int age){
        System.out.println("the age of the candidate is  "+ age+ " years old");
    }

    public static void main(String[] args) {
        //as it is a static method we dont need to create the objects to call the methods
        myMethod(24);
    }
}
