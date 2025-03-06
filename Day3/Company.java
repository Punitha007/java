class Company {
    static String companyName = "Tech Solutions";
    String employeeName;
     Company(String employeeName) {
        this.employeeName = employeeName;
    }
   void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }
  public static void main(String[] args) {
        Company e1 = new Company("Thilakshitha");
        Company e2 = new Company("Maha");
        e1.displayDetails();
        e2.displayDetails();
        companyName = "Innovative Tech";
        e1.displayDetails();
        e2.displayDetails();
    }
}
