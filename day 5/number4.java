import java.util.Scanner;

class pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();
        int sum = 0, digit;

        while (no > 0) {
            digit = no % 10;
            sum = sum + digit;
            no = no / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}