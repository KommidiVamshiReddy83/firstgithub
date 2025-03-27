public class MethodWithReturn2 {
    public int myMethod(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        //System.out.println(myMethod(2,2));
        MethodWithReturn2 Return=new MethodWithReturn2();
        System.out.println(Return.myMethod(2,2));
    }
}
