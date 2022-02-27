import java.util.Scanner;
public class Account {

    static int minbalance;

    static {
        minbalance = 500;
    }

    public static int getMinbalance() {
        return minbalance;
    }

    public static void main(String[] args) {
//        double balance = 600;
//        System.out.println("Amount to withdraw");
//        double amount = 500;
//        Scanner sc = new Scanner(System.in);
//        amount = sc.nextInt();
//        if (amount <= 0 || amount > balance) {
//            System.out.println("Withdrawal has failed");
//        } else {
//            balance -= amount;
//            System.out.println("Withdrawal has succeeded");
//        }


        System.out.println("The value " + getMinbalance());
    }



}
