package Practice1;
//program to print product of numbers from 1 to 10

public class prog12 {
    public static void main(String[] args) {
        int product=1;
        /*for(int i=1;i<10;i++){
            product=product*i;

        }*/
        int i=1;
        while(i<=10){
            product=product*i;
            i++;
        }
        System.out.println(product);

    }
}
