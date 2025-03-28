public class Constructors3 {
    String fName;
    String lName;
    String FName;
    public Constructors3(String name1,String name2 ,String name3){
        fName=name1;
        lName=name2;
        FName=name3;
    }

    public static void main(String[] args) {
        Constructors3 myobj =new Constructors3("vamshi","krishna","vamshiKrishna");
        System.out.println(myobj.fName+' '+myobj.lName+' '+myobj.FName);
    }
}
