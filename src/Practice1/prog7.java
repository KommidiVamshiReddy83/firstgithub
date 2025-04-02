package Practice1;
//program to print numbers from 1 to 10 except 3 and 5

public class prog7 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 3){
                continue;
            }
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
}




