import java.util.Scanner;

class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();

        for (int i = no; i >= 1; i--) {
            for (int j = i; j <= no; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}