package Encapsulation;

public class Enscapsulation2 {
    private int age;
    private String name;
    private char grade;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public char getGrade(){
        return grade;
    }

    public static void main(String[] args) {
        Enscapsulation2 encapse=new Enscapsulation2();
        encapse.setAge(28);
        encapse.setName("vamshi");
        encapse.setGrade('A');
        System.out.println("The name of the candidate is "+encapse.getName()+" the age of "+ encapse.getName() + " is "+encapse.getAge());
    }

}
