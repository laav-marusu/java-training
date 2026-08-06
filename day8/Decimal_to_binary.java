import java.util.Scanner;

class Decimal_to_binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while(num > 0) {
            int rem = num % 2;
            binary = binary + (rem * place);
            num = num / 2;
            place = place * 10;
        }

        System.out.print("Binary is: " + binary);
    }
}