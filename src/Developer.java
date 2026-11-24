public class Developer extends Employee implements generateReport, CodeReviewer{

    public Developer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }
//
//    public void writeCode(){
//        System.out.println("Developer is writing code");
//    }

//    @Override
//    public void work(){
//        System.out.println("Developer is working");
//    }

    @Override
    public void performWork() {
        System.out.println("Developer is writing code");
    }


    @Override
    public void reportGeneration() {
        System.out.println("Developer is generating report");
    }

    @Override
    public void reviewCode() {
        System.out.println("Developer is reviewing his code");
    }
}
