import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int no=1;
        for (int i = 0; i < n; i++) {
            arr[i]=no++;
            System.out.print(arr[i] + " ");
        }
    }
}