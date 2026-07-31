import java.util.Scanner;

class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            for (int j = no; j >= i; j--)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}