public class ShortHandIfElse {
    public static void main(String[] args) {
        //Type variablename=if(condition)?:expression True:expressionfalse;
        int age=28;
        String name="vamshi";
        if(age<=18){
            System.out.println("Congratulations mr "+name+  "you are eligible to vote ");
        }else{
            System.out.println("mr "+name + "  currently you are not eligible for voting kindly read the instructions ");
        }
        //shorthandifelsestatementfor above example
        String result=(age>=18)?("Congratulations mr "+name+  "you are eligible to vote "):("mr "+name + "  currently you are not eligible for voting kindly read the instructions ");
        System.out.println(result);
    }
}
