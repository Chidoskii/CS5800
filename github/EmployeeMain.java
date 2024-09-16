public class EmployeeMain {
    public static void main(String[] args) {
        SalariedEmployee worker1 =  new SalariedEmployee();
        HourlyEmployee worker2 =  new HourlyEmployee();
        HourlyEmployee worker3 =  new HourlyEmployee();
        CommisionEmployee worker4 =  new CommisionEmployee();
        SalariedEmployee worker5 =  new SalariedEmployee();
        BaseEmployee worker6 =  new BaseEmployee();
        CommisionEmployee worker7 =  new CommisionEmployee();

        worker1.setName("Joe", "Jones");
        worker1.setSSN("111-11-1111");
        worker1.setWeeklySalary(2500);
        worker1.getInfo();

        worker2.setName("Stephanie", "Smith");
        worker2.setSSN("222-22-2222");
        worker2.setWage(25);
        worker2.setHours(32);
        worker2.getInfo();

        worker3.setName("Mary", "Quinn");
        worker3.setSSN("333-33-3333");
        worker3.setWage(19);
        worker3.setHours(47);
        worker3.getInfo();

        worker4.setName("Nicole", "Dior");
        worker4.setSSN("444-44-4444");
        worker4.setCommissionRate(15);
        worker4.setGrossSalary(50000);
        worker4.getInfo();

        worker5.setName("Renwa", "Chanel");
        worker5.setSSN("555-55-55555");
        worker5.setWeeklySalary(1700);
        worker5.getInfo();

        worker6.setName("Mike", "Davenport");
        worker6.setSSN("666-66-6666");
        worker6.setBaseSalary(95000);
        worker6.getInfo();

        worker7.setName("Mahnaz", "Vaziri");
        worker7.setSSN("777-77-7777");
        worker7.setCommissionRate(22);
        worker7.setGrossSalary(40000);
        worker7.getInfo();

        System.out.println("Exiting program...");
        System.exit(0);
    }
}
