public class RealLifeExampleForWhileLoop {
    //creating  a countdown
    public static void main(String[] args) {
        int countdown=3;
        while(countdown>0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy Birthday");
        int age=15;
        String name="vamshi";
        while(age<=18){
            if(age<17){
                System.out.println("hey " +name+"you can't participate in voting");
            }else {
                System.out.println("hey Congratulations mr "+name+ " you can now participate in voting");
            }
            age++;
        }
    }
}
