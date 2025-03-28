package Encapsulation;

public class Encapsulation1 {
    private int emp_id;
    public void setEmp_id(int empId){
        emp_id=empId;
    }
    public int getEmp_id(){
        return emp_id;
    }

    public static void main(String[] args) {
        Encapsulation1 obj=new Encapsulation1();
        obj.setEmp_id(19);
        System.out.println(obj.getEmp_id());
    }
}
