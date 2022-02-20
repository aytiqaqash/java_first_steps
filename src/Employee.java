public class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        PermanentEmployee pE = new PermanentEmployee();
        ContractEmployee cE = new ContractEmployee();

        pE.setEmpId(1);
        pE.setName("Ziya");
        pE.setBasicPay(10000);
        pE.setHra(1500);
        pE.setExperience(3);
        pE.calculateSalary();

        cE.setEmpId(2);
        cE.setName("Pep");
        cE.setHours(10);
        cE.setWages(500);
        cE.calculateSalary();

    }
}
