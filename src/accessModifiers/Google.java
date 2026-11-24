package accessModifiers;

public class Google extends Company {


    public static void main(String[] args) {

        Company company = new Company();
        String newName = company.name;
        String newLocation = company.location;
        company.CompanyProfit();
        company.overAllCompanyRanking();

    }

}
