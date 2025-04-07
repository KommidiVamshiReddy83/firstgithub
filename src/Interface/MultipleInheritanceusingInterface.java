package Interface;

public class MultipleInheritanceusingInterface  implements Interface1,Interface2,Interface3{
    @Override
    public void method1() {
        System.out.println("implementation of 1st method");
    }

    @Override
    public void method2() {
        System.out.println("implementation of 2nd method");

    }

    @Override
    public void method3() {
        System.out.println("implementation of 3 rd method");

    }

    @Override
    public void method4() {
        System.out.println("implementation of 4 th method");

    }

    @Override
    public void method5() {
        System.out.println("implementation of 5 th method");

    }

    @Override
    public void method6() {
        System.out.println("implememtation of 6th method");

    }

    public static void main(String[] args) {
        MultipleInheritanceusingInterface multipleInheritanceusingInterface=new MultipleInheritanceusingInterface();
        multipleInheritanceusingInterface.method1();
        multipleInheritanceusingInterface.Method1();
    }


}
