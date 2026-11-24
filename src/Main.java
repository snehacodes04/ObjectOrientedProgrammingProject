import accessModifiers.Company;
import acessmodifier2.Microsoft;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Employee empl1 = new Employee("sneha",101, 40000);
//        Employee empl2 = new Employee("Anu",102,60000);
//        Employee empl3 = new Employee(empl1);
//        empl1.displayDetails();
//        empl2.displayDetails();
//        empl3.displayDetails();
//        System.out.println(empl1);

//        String name = empl1.name ="Sneha";
//        int empId = empl1.employeeId= 101;
//        double empSalary = empl1.salary = 40000;
//
//        System.out.println(name);
//        System.out.println(empId);
//        System.out.println(empSalary);

//        empl1.work();

//
//        String name1 = empl2.name ="Anu";
//        int empId1 = empl2.employeeId= 102;
//        double empSalary1 = empl2.salary = 70000;
//
//        System.out.println(name1);
//        System.out.println(empId1);
//        System.out.println(empSalary1);

//        empl2.work();

        //To-do  Create an empl3 object with name Merlin, 103, 80000, method
//        to-do create a constructor which takes 2 parameter and display the output.
//        To-do add a private variable like department and create getter and setter also allow only development, Testing and HR, reject other department

//        empl1.salary;

//        System.out.println(empl1.getSalary());
//        empl1.setSalary(70000);
//        System.out.println(empl1.getSalary());
//        empl1.setSalary(-70000);
//        empl1.writeCode();

//        Developer dev1 = new Developer("sneha",101,70000);
//        dev1.writeCode();
//        dev1.displayDetails();
//        dev1.work();
//
//        Tester tester1 = new Tester("Anu",102,60000);
//        tester1.testApplication();
//        tester1.displayDetails();
//        tester1.work();

//        to-do : Create one more child manager
//        extends employee constructor with name, employeeId, Salary, user super keyword,
//        create a method teamManager(), also create object for manager and call displaydetails of manager along with teamManager method.

//        todo : Complete compile and runtime polymorphism for manager.
//


//        Employee empl4 = new Developer("sneha",101,70000);
//        empl4.work();
        /*empl4.work(3,"sneha");
        empl4.work("sneha",4);*/

//        Employee empl1 = new Developer("sneha",101,70000);
//        Employee empl2 = new Tester("anu",102,40000);
//
//        empl1.displayDetails();
//        empl1.performWork();
//
//        empl2.displayDetails();
//        empl2.performWork();

        //        todo : Complete abstraction for manager.
//
//        Developer dev1 = new Developer("sneha",101,70000);
//        dev1.displayDetails();
//        dev1.performWork();
//        dev1.reportGeneration();
//        dev1.reviewCode();

        Microsoft company = new Microsoft();
        String newName = company.name;
        String newLocation = company.location;
        company.CompanyProfit();
        company.overAllCompanyRanking();

    }
}