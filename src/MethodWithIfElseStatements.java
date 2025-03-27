public class MethodWithIfElseStatements {
    static void myMethod(int age,String name){
        if(age<=18){
            System.out.println("Yes " +name+ "you are eligible to vote");
        }
        else{
            System.out.println("no  " + name + "  you are now now not eligible to vote");
        }
    }

    public static void main(String[] args) {
        myMethod(29,"Vamshi");
    }
}
