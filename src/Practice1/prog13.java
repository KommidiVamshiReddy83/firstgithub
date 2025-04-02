package Practice1;
//program to print factorial of a given number by user

import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number for which you want to find the factorial");
        int x=scanner.nextInt();
    //now find the factorial of x 12!
        int factorial=1;
        for(int i=1;i<=x;i++){//1 2 3
            factorial=factorial*i;//1=1*1=1; 1=1*2=2; 2=2* 3=6
        }
        System.out.println(factorial);

    }
}
