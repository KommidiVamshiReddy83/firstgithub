package Practice1;
//print numbers from 1 to 10 except 5

public class prog6 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
            if(i==5){
                continue;
            }
        }
    }
}
