import java.util.Scanner;

class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            int a = i % 2;   // Odd row starts with 1, Even row starts with 0

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = 1 - a;   // Toggle between 0 and 1
            }

            System.out.println();
        }
    }
}