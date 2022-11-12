package Javatpoint;

public class Fibonacci {
    static int n1=0, n2=1,  n3=0;
    public static void main(String args[]){
        int count = 10;
        // rekursiya ile
        System.out.print(n1 + " " + n2);
        printFibonacciRecursion(count-1);
    }

    static void printFibonacciRecursion(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibonacciRecursion(count - 1);
        }
    }

    static void printFibonacci(int count){
        int n1=0,n2=1, n3, i;
        System.out.print(n1 + " " + n2);
        for(i=2; i<count; i++){
            n3 = n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }

    }
}
