import java.util.Scanner;

class reverse_spiral {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No : ");
        int no = sc.nextInt();

        int matrix[][] = new int[no][no];

        int r, c, num = 1;

        for (r = 0; r < (no + 1) / 2; r++) {

            // Fill Left Column (Top to Bottom)
            for (c = r; c < no - r; c++) {
                matrix[c][r] = num++;
            }

            // Fill Bottom Row (Left to Right)
            for (c = r + 1; c < no - r; c++) {
                matrix[no - r - 1][c] = num++;
            }

            // Fill Right Column (Bottom to Top)
            for (c = no - r - 2; c >= r; c--) {
                matrix[c][no - r - 1] = num++;
            }

            // Fill Top Row (Right to Left)
            for (c = no - r - 2; c > r; c--) {
                matrix[r][c] = num++;
            }
        }

        System.out.println("\nReverse Spiral Matrix:");

        for (r = 0; r < no; r++) {
            for (c = 0; c < no; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}