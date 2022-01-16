import java.util.Scanner;

public class FunCalculator {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String ArmstrongNumber() {
        int result = 1;
        int n = this.getNumber();
        int sum = 0;
        while (n != 0) {
            result = n % 10;
            n = n / 10;
            sum = sum + result * result * result;
        }

        if (((int) sum) == this.getNumber()) {
            return "The number " + this.getNumber() + " is an Armstrong number";
        }

        return null;

    }

    public String LuckyNumber() {
        int result = 1;
        int n = this.getNumber();
        int steps = 0;
        int sum = 0;
        while (n != 0) {
            result = n % 10;
            n = n / 10;
            steps++;
            if(steps % 2 != 0){
                sum = sum + result * result;
            }
        }
        if (((int) sum)%9 == 0){
            return "The number " + this.getNumber() + " is a Lucky number";
        }
        return null;
    }

    public static void main(String[] args) {
        FunCalculator fc = new FunCalculator();
        System.out.println("1. Calculate Armstrong Number");
        System.out.println("2. Calculate Lucky Number");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if (choice == 1) {
            fc.setNumber(153);
            System.out.println(fc.ArmstrongNumber());
        } else if (choice == 2) {
            fc.setNumber(1623);
            System.out.println(fc.LuckyNumber());
        } else {
            System.out.println("Ooops! Invalid choice.");
        }
    }
}
