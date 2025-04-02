package Practice1;
//program to print even numbers from x and y taking x and y as input from user

import java.sql.SQLOutput;
import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the X value");
        int x=scanner.nextInt();
        System.out.println("please enter the Y value");
        int y=scanner.nextInt();
        System.out.println("the even numbers between X and Y are:");
        /*if(x%2==0){
            System.out.println(x);
        }*/

        /*while(x<=y){
            if(x%2==0){
                System.out.println(x);
            }
            x++;
        }*/
        for (int X=x;X<=y;X++){
            if(X%2==0){
                System.out.println(X);
            }
        }
    }
}
