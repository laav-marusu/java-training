import java.util.Scanner;

public class Primenumber_Fibonacci {

    static int f1 = 1, f2 = 1, f3 = 0;
    static int count = 0;
    static int num = 2;

    static void fibonacci() {
        if(count == 0 || count == 1) {
            System.out.print("1 ");
            count++;
        }
        else {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
            count++;
        }
    }

    static void prime() {
        while(true) {
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(num + " ");
                num++;
                break;
            }

            num++;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {

            if(i % 2 == 1) {
                fibonacci();
            }
            else {
                prime();
            }
        }
    }
}