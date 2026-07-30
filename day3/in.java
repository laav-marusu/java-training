import java.util.Scanner;

class in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        for (int i = 1, j = no; i <= no && j >= 1; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}