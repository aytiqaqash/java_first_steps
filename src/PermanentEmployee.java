public class PermanentEmployee extends Employee {
    private double basicPay, hra;
    private int experience;

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getHra() {
        return hra;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void calculateSalary(){
        double percentageOfBasicPay;
        if (this.getExperience() < 3){
            percentageOfBasicPay = 0*this.getBasicPay();
        }else if (this.getExperience()>=3 && this.getExperience()<5){
            percentageOfBasicPay = 0.05*this.getBasicPay();
        }else if(this.getExperience()>=5 && this.getExperience()<10){
            percentageOfBasicPay = 0.07*this.getBasicPay();
        }else{
            percentageOfBasicPay = 0.12 * this.getBasicPay();
        }

        double wage = percentageOfBasicPay + this.getBasicPay() + this.getHra();

        System.out.println("Name " + this.getName());
        System.out.println("Employee Id " + this.getEmpId());
        System.out.println("Basic Pay " + this.getBasicPay());
        System.out.println("HRA " + this.getHra());
        System.out.println("Experience  " + this.getBasicPay());
        System.out.println("Permanent Employee: Your salary is:  " + wage);


    }
}
