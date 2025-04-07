public class Constructors3 {
    String fName;
    String lName;
    String FName;
    public Constructors3(String fName,String name2 ,String name3){
        this.fName=fName;
        lName=name2;
        FName=name3;
    }

    public static void main(String[] args) {
        Constructors3 myobj =new Constructors3("vamshi","krishna","vamshiKrishna");
        System.out.println(myobj.fName+' '+myobj.lName+' '+myobj.FName);
    }
}
