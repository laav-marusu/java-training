// prime numbers
import java.util.Scanner;

class Pattern6 {
    static boolean isPrime(int num) {
        if (num < 1) 
            return false;
        if(num == 1 || num == 2)
            return true;
        if(num%2==0)
        return false;
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int no = sc.nextInt();
        if(isPrime(no))
            System.out.println("Prime number");
        else
            System.out.println("Not Prime number");
        sc.close();   
    }
}