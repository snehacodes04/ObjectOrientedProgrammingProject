package accessModifiers;

public class main {
    public static void main(String[] args) {
//        public
//        private
//        protected
//        default
        Company company = new Company();
        String newName = company.name;
        String newLocation = company.location;
        company.CompanyProfit();
        company.overAllCompanyRanking();

    }
}
