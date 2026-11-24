package accessModifiers;

public class Company {

    public String name;
    public String location;

    String newName = name;
    String newlocation = location;

    public void CompanyProfit(){
        System.out.println("2026 has good profit");
    }

    public void overAllCompanyRanking(){
        CompanyProfit();
    }



}
