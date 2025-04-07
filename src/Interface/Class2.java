package Interface;

public class Class2 implements Class1 {

    public void myMethod1() {
        System.out.println("this is the body for the method1");

    }

    public void myMethod2() {
        System.out.println("this is body for the method2");

    }

    //lets try to create the objects here in this class only rather than creating another class to create the objects
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.myMethod2();
        class2.myMethod1();
        /*Class1 class1 = new Class1() {
            @Override
            public void myMethod1() {
                System.out.println("this is updated method1");
            }

            @Override
            public void myMethod2() {
                System.out.println("this is updated method2");

            }
        };*/


    }
}