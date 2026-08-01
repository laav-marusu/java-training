// Sum of digits
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        int sum = 0, digit,n;
        n=no;
        while (no > 0) {
            digit = no % 10;
            sum = sum + (digit*digit*digit);
            no = no / 10;
        }
        if(n==sum)
            System.out.println("Armstrong No");
        else{
            System.out.println("Not Armstrong No");
            
        sc.close();
        }
    }
}