package Practice1;
//program to print natural numbers from x and y taking x and y as input from user

import java.io.InputStream;
import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value for X  ");
        int x=scanner.nextInt();
        System.out.println("enter the value for Y  ");
        int y=scanner.nextInt();
        System.out.println("the first 10 natural numbers are :");
        for(int X=x;X<=y;X++){
            //System.out.println("the natural numbers from X and Y are ");
            System.out.println(X);
        }

    }
}
