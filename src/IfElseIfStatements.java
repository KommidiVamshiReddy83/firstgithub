import javax.swing.*;

public class IfElseIfStatements {
    //if(CONDITION)
    //else--if the condition in if statement is not correct it will come to else statement
    //else if --we use this when we have multiple conditions
    public static void main(String[] args) {
        if(10>20){ //if we use 10>20 means the condition will fail then it will go to else block
            System.out.println("10 is lessthan 20");
        }else{
            System.out.println("10 is not greater than 20");
        }
        //ifelseif
        if(20>30){
            System.out.println("here the condition will fail then goes to elseif condition");
        }else if(10==110){
            System.out.println("the else if block will be executed because the if condition has failed");
        }
        else{
            System.out.println("this block will execute only if the both conditions in if and else is get file");
        }
    }
}
