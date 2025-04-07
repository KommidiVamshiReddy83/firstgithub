package Practice1;
//sum of factors of a given numbners

import java.util.Scanner;

public class prog16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int x=scanner.nextInt();
        int s=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                s=s+i;
            }
        }
        System.out.println(s);

    }
}
