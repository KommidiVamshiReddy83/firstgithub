package Inheritance;

public class guest {
    public static void main(String[] args) {
        Admin admin=new Admin();
        admin.Delete();
        admin.read();
        admin.write();
        User user=new User();
        user.read();
        Developer developer=new Developer();
        developer.write();
        developer.read();
        

    }
}
