public class Tester extends Employee{
    public Tester(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void performWork() {
        System.out.println("tester is testing the application");
    }

//    @Override you cannot have this here
//    public void testApplication(){
//        System.out.println("tester is testing the application");
//    }
//
//    @Override
//    public void work(){
//        System.out.println("tester is working");
//    }

}
