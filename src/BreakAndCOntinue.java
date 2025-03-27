public class BreakAndCOntinue {
    //Break is used to jump out of a Switch statement and also used to jump out of a loop
    //COntinue Statement breaks only one iteration when the specific condition is reached and continues with other iterations in the loop
    public static void main(String[] args) {
        //break with for loop
        int i=0;
        for (i=0;i<=5;i++){
            if (i==2) {
                break;
            }
            System.out.println(i);
        }
        //continue with for loop
        int l=0;
        for(l=0;l<9;l++){
            if(l==3){
                continue;
            }
            System.out.println(l);
        }
        //continue with while
        int j=0;
        while(j<=10){
            if(j==4){

                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
        //break with while condition
        int k=0;
        while(k<=10){
            if(k==3){
                k++;
                break;
            }
            System.out.println(k);
            k++;
        }
    }
}
