package Practice1;
//prime number program
import java.util.Scanner;

public class prog14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int x= scanner.nextInt();
        int temp=0;
        for (int i=2;i<=x-1;i++){
            if(x%i==0) {
                temp = temp + 1;
            }
        }
        if(temp>0){
            System.out.println("not  a prime number");
        }
        else{
            System.out.println("prime number");
        }

    }
}
