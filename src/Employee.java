//Employee is a Class
//name, employeeId, salary are instance variable
//work() is a method
//Class is ablueprint for creating employee object.
public abstract class Employee {

//    Employee(){
//        System.out.println("Hey! I am default constructor");
//    }

    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(Employee otherEmployee){
        this.name = otherEmployee.name;
        this.employeeId = otherEmployee.employeeId;
        this.salary = otherEmployee.salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        } else{
            System.out.println("invalid salary!!");
        }
    }

    void work(){
        System.out.println("Employee is working");
    }
//
//    void work(String name){
//        System.out.println(name + " is working");
//    }
//    void work(String name, int employeeId){
//        System.out.println(name + " is working");
//    }
//    void work(int employeeId,String name){
//        System.out.println(name + " is working");
//    }
//    void work(double salary){
//        System.out.println(name + " is working");
//    }


    void displayDetails(){
        System.out.println("Name:" + name);
        System.out.println("EmployeeId :" + employeeId);
        System.out.println("Salary: " + salary);
    }

    public abstract void performWork();

}
