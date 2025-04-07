package Inheritance;

public class Developer extends User{
    /*public void read(){
        System.out.println("read the information");
    }*/
    public void write()
    {
        super.read();
        System.out.println("write the information");
    }
    public void read(){
        System.out.println("this is read of developer");
    }
}
