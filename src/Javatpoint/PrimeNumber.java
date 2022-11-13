package Javatpoint;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        // check Prime numbers between 2 numbers
        Scanner s = new Scanner(System.in);
        System.out.print("Bashlanghic reqemi daxil edir: ");
        int start = s.nextInt();
        System.out.print("Son reqemi daxil edin: ");
        int end = s.nextInt();
        System.out.println(" Daxil olan reqemler arasinda olan Prime reqemler:");
        checkPrimeNumberBetwenTwoNumbers(start,end);

    }

    public static void checkPrimeNumberBetwenTwoNumbers(int start, int end){
        for(int i = start; i <= end; i++){
            checkPrimeNumberSolution1(i);
        }
    }
    public static void  checkPrimeNumberSolution1(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n == 0 || n==1){
//            System.out.println(n+" Prime deyil");
        }else{
            for(i=2;i <= m;i++){
                if(n%i == 0){
//                    System.out.println(n+" prime deyil");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n+" prime reqemdir");
            }
        }
    }
}
