class Loan2 {
    private int loanNo, accountNo, customerNo, loanDuration;
    private float loanAmount, interest;

    private static int loanCounter; //  static variable

    Loan2(){
        loanCounter ++ ; // using static variable in constructor
    }

    Loan2(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter ++ ;  // using static variable in constructor
    }

    // static block
    static{
        loanCounter = 100;
    }

    // static method
    static int getLoanCounter() {
        System.out.println(loanCounter);
        return loanCounter;
    }

    // getters and setters
    int getAccountNo() {
        return accountNo;
    }
    int getCustomerNo() {
        return customerNo;
    }
    float getLoanAmount() {
        return loanAmount;
    }
    int getLoanDuration() {
        return loanDuration;
    }
    float getInterest() {
        return interest;
    }
    int getLoanNo() {
        return loanNo;
    }
    void setLoanNo (int loanNo ) {
        this.loanNo = loanNo;
    }
    void setAccountNo (int accountNo ) {
        this.accountNo = accountNo;
    }
    void setCustomerNo (int customerNo ) {
        this.customerNo = customerNo;
    }
    void setLoanAmount (float loanAmount ) {
        this.loanAmount = loanAmount;
    }
    void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }
    void setInterest (float interest ) {
        this.interest = interest;
    }
}

class LoanTester{
    public static void main(String[] args) {
        Loan2 obj1= new Loan2();
        Loan2.getLoanCounter();

        Loan2 obj2= new Loan2();
        Loan2.getLoanCounter();

        Loan2 obj3 = new Loan2(1234,101,30000,12,2);
        Loan2.getLoanCounter();

        Loan2 obj4 = new Loan2(3456,102,50000,6,3);
        Loan2.getLoanCounter();
    }
}