
import java.util.Scanner;

class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd no: ");
        int no = sc.nextInt();

        for (int i = no; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}