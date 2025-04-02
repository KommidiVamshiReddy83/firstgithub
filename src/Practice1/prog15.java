package Practice1;

import java.util.Scanner;

//count factors of a given numbeeeeer
public class prog15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int x=scanner.nextInt();
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count=count+1;
            }
        }
        System.out.println(count);

    }
}
