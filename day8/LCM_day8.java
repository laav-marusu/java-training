import java.util.Scanner;
class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter No 2:");
        int num2 = sc.nextInt();
        int gcd = 0;
        for(int i=1; i<=num1 && i<=num2;i++) {
            if(num1%i==0 && num2%i==0) {
                   gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.print("LCM is: " + lcm);
    }
}