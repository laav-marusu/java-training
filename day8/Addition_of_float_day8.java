import java.util.Scanner;

class Addition_of_float {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No 1: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter No 2: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;

        System.out.print("Sum is: " + sum);
    }
}