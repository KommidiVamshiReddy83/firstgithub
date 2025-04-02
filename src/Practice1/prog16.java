package Practice1;
//check given number is perfect or not
//perfect numbber means sum of all the factors/divisors is equal to that number
import java.util.Scanner;

public class prog16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number to check it is a perfect or not");
        int x=scanner.nextInt();
        String array[]=0
        for(int i=0;i<=x;i++){
            if(x%i==0){
                array[]=array[]+i

            }
        }

    }
}
