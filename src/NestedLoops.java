public class NestedLoops {
    public static void main(String[] args) {
        int i=0,j=0;
        //outer loop
        for(i=1;i<=4;i++){//o<=0 T 1 <=4 T
            System.out.println("outer loop" +i);//outer loop  0 outer loop 1
            for (j=0;j<=5;j++){//0<=5 T 1<=5 T 2<=5 T 3<=5 T 4 t 5 t 6<=5 F so goes to outer loop
                System.out.println("inner loop" + j);//inner loop 0 inner loop 1
                //inner loop 2 inner 3 inner loop 4 inner loop 5
            }
        }

    }
}
