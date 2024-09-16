public class Employee {
    protected String firstName = "blank", lastName = "blank";
    protected String ssn = "blank";

    //function to set first and last name
    public void setName(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }

    //function to set social security number
    public void setSSN(String social){
        this.ssn = social;
    }

    //function to get employee information
    public void getInfo(){
        System.out.println(firstName + " " + lastName + " " + ssn);
    }
}

class SalariedEmployee extends Employee{
    protected double weeklySalary;

    //function to set weekly salary
    public void setWeeklySalary(double earnings){
        this.weeklySalary = earnings;
    }

    public void getInfo(){
        System.out.println(firstName + "\t" + lastName + "\t" + ssn + "\t" + "$" + String.format("%.2f", weeklySalary));
    }
}

class HourlyEmployee extends Employee{
    protected double wage;
    protected int hours;

    //function to set wage
    public void setWage(double rate){
        this.wage = rate;
    }

    //function to set hours
    public void setHours(int time){
        this.hours = time;
    }

    public void getInfo(){
        System.out.println(firstName + "\t" + lastName + "\t" + ssn + "\t" + "$" + String.format("%.2f", wage) + "\t" + hours);
    }
}

class CommisionEmployee extends Employee{
    protected int commissionRate;
    protected double grossSalary;

    //function to set commission rate
    public void setCommissionRate(int rate){
        this.commissionRate = rate;
    }

    //function to set gross salary
    public void setGrossSalary(double salary){
        this.grossSalary = salary;
    }

    public void getInfo(){
        System.out.println(firstName + "\t" + lastName + "\t" + ssn + "\t" + commissionRate + "%\t" + "$" + String.format("%.2f", grossSalary));
    }
}

class BaseEmployee extends Employee{
    protected double baseSalary;

    //function to set base salary
    public void setBaseSalary(double earnings){
        this.baseSalary = earnings;
    }

    public void getInfo(){
        System.out.println(firstName + "\t" + lastName + "\t" + ssn + "\t" + "$" + String.format("%.2f", baseSalary));
    }
}