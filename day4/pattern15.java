import java.util.Scanner;
class Pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();
        int a = 65;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)a+" ");
            }
            a++;
            System.out.println();
        }
    }
}