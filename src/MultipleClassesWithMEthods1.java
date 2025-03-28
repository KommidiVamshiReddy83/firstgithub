public class MultipleClassesWithMEthods1 {
    static void method(){
        System.out.println("hello this is the first method in first class with methods");
    }
    static void Method(int maxspeed){
        System.out.println("hello this is the second method in first class with objects"+maxspeed);
    }

    public static void main(String[] args) {
        method();
        Method(22);
    }
}
