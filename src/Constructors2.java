public class Constructors2 {
    int x;
    public Constructors2(int y){//this parameter will be called when creating the objects
        x=y;//the value of x is initialized used the parameter y when creating a object
    }

    public static void main(String[] args) {
        Constructors2 myobj =new Constructors2(522);
        System.out.println(myobj.x);
    }
}
