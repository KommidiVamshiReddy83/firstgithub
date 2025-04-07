package Interface;

public interface Interface1 {
    void method1();
    void method2();
    public default void Method1(){
        System.out.println("hello this is the first default method in interface");
    }
}
