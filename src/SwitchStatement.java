public class SwitchStatement {
    //Switch Statement means it will multiple cases followed by a break statement
    //instead of having multiple ifelse statements we can use switch statement as alternative to it
    public static void main(String[] args) {
        int x=3;
        switch (x) {
            case 1:
                System.out.println("condition not statisfied");
                break;
            case 2:
                System.out.println("condition not satidfied");
                break;
            case 3:
                System.out.println("condition three is satisfied beacuse it matches the value");
                break;
            case 4:
                System.out.println("condition satisifed");
                break;
            case 5:
                //here it will not come because we use the break statement but lets try
                System.out.println("condition not satisfied");
                break;
            default:
                System.out.println("this is how switch statement works it will only go upto the first condtion that is true and ignores all other expressions as we use break in every expression");


        }
    }
}
