package Practice1;
//program to print sum of numbers from x to y taking x and y as input from user

import java.util.Scanner;

public class prog11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter X value");
        int x=scanner.nextInt();
        System.out.println("enter Y value");
        int y=scanner.nextInt();
        System.out.println("the sum of numbers between X and Y are:");
      int sum=0;
        for (int i=x;i<=y;i++){
            sum=sum+i;

        }
        System.out.println(sum);



    }
}
