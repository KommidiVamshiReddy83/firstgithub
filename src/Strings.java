public class Strings {
    //string
    //string concatination
    //numbers and strings
    //special characters
    //strings are used to store text.Simple string is a variable contains a collection of characters surrounded by the double quotes
    public static void main(String[] args) {


        String greeting = "hello Vamshi";
        System.out.println(greeting);
        System.out.println(greeting.length());//to know the length of the string
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("h"));
        //string concatination
        String fName="vamshi";
        String lName="krishna";
        System.out.println(fName+" "+lName);
        System.out.println(fName.concat(lName));
        //add numbers
        int x=5;
        int y=8;
        int z=x+y;
        System.out.println(z);
        String X="10";
        String Y="33";
        String Z=X+Y;
        System.out.println(Z);
        //if we add a number and a string the result will be a string
        String A="10";
        int B=9;
        String C=A+B;
        System.out.println(C);
        //Special characters in strings
        //for example if we write this String txt= ("this is "mr vamshi" and i am from hyd")
        //we will get error because txt is having multiple double quotes inside it
        //in oreder to avoid it we have special characters
        // \" mr vamshi \"---> this will used
        //for single quotes use--> \' mr vamshi \'
        // for backslash use--> \\mr vamshi\\
        String txt="hi my name is \"Vamshi Krishna\" and i am from hyd";
        System.out.println(txt.length());
    }
}
