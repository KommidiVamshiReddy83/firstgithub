package Practice1;
//program to print multiples of 7 between x and y taking x and y as inputs from user

import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter X value");
        int x=scanner.nextInt();
        System.out.println("enter Y value");
        int y=scanner.nextInt();
        System.out.println("the multiples of 7 between X and Y are:");
        while(x<=y){
            if(x%7==0){
                System.out.println(x);
            }
            x++;
        }
    }
}
