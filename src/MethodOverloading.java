public class MethodOverloading {
    //method overloading means having same name for different methods but they will be having different parameters init.
    static void myMethod(){
        System.out.println("hello this is first method");
    }
    static void myMethod(int x){
        System.out.println("this is same like first method but with a parameter");
    }
    public void  myMethod(int x ,int y){
        System.out.println("this is with two parameters and with public type");
        //to call this method we need to create the object because it is non static
    }

    public static void main(String[] args) {
        myMethod();
        myMethod(3);
        MethodOverloading method=new MethodOverloading();
        //System.out.println(method.myMethod(2,2));
        method.myMethod(2,2); //create obj then call the method
    }
}
