package Practice1;
//sum of numbers from x and y taking x and y as input from user

import java.util.Scanner;

public class prog17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter X value");
        int x=scanner.nextInt();
        System.out.println("enter Y value");
        int y=scanner.nextInt();
        int sum=0;
        for(int i=x;i<=y;x++){
            sum=sum+x;
        }
        System.out.println(sum);


    }
}
