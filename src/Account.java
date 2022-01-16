import java.util.Scanner;
public class Account {
    public static void main(String[] args) {
        double balance = 600;
        System.out.println("Amount to withdraw");
        double amount = 500;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if (amount <= 0 || amount > balance) {
            System.out.println("Withdrawal has failed");
        } else {
            balance -= amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}
