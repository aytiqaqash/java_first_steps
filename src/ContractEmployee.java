public class ContractEmployee extends Employee{
    private double wages;
    private int hours;

    public void setWages(double wages) {
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void calculateSalary(){

        double salary;

        salary = this.getHours() * this.getWages();

        System.out.println("Name " + this.getName());
        System.out.println("Employee Id " + this.getEmpId());
        System.out.println("Hours " + this.getHours());
        System.out.println("Wages  " + this.getWages());
        System.out.println("Contract Employee: Your salary is:  " + salary);
    }

}
