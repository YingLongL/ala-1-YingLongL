package CSE_017.ALA_1;

public class Employee extends Person{
    private String position;

    public Employee(){
        super();
        position="none";
    }

    private double salary;

    public salary(){
        salary="none";
    }
    
    public Employee(int id, String name, String address, String phone, String email, String position,double salary){
        super(id,name,address,phone,email);
        this.position =position;
        this.salary =salary;
    }

    public String getPosition(){
        return position;
    }

    public Double getSalary(){
        return salary;
    }

    public void setPosition(String position){
        this.position =position;
    }

    public void setSalary(Double salary){
        this.salary =salary;
    }

    public String toString(){
        String str = super.toString();
        str = String.format("Position: %s\nSalary: %f\n",position,salary);
        return str;
    }
}