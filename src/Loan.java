class Loan{
    int i;
    Loan(int x){
        i=x;
        System.out.println("Request for loan");}

}

class HomeLoan extends Loan{
    int i;
    HomeLoan(){
        super(10);
        i=super.i;
        System.out.println("Request for homeloan"+i);
    }

    public static void main(String[] args){
        HomeLoan obh=new HomeLoan();
    }
}