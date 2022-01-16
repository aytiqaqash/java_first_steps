import java.util.Scanner;
public class ReverseCalculator {
    public void whileLoop(int n) {
        int result = 0;
        String output = "";
        while (n != 0) {
            result = n % 10;
            n /= 10;
            output += result;
        }
        System.out.println("The reverse of the number using while is: " + output);
    }

    public void forLoop(int n) {
        int result = 0;
        String output = "";
        for (int i = n; i > 0; i /= 10) {
            result = i % 10;
            output += result;
        }
        System.out.println("The reverse of the number using for is: " + output);
    }

    public void dowhileLoop(int n) {
        int result = 0;
        String output = "";
        do {
            result = n % 10;
            n /= 10;
            output += result;
        } while (n != 0);
        System.out.println("The reverse of the number using do-while is: " + output);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ReverseCalculator rc = new ReverseCalculator();
        rc.whileLoop(n);
        rc.forLoop(n);
        rc.dowhileLoop(n);
    }
}