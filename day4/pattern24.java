import java.util.Scanner;

class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            for (int s = 1; s <= no - i; s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}