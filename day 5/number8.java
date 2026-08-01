import java.util.Scanner;
class numnber8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int no = sc.nextInt();
        System.out.print("Enter First Term :");
        int ft = sc.nextInt();
        System.out.print("Enter Difference :");
        int dt=sc.nextInt();
        int seq=0;
        for(int i=0;i<=no;i++) {
            seq=ft+i*dt;
            System.out.print(seq + " ");
        }
    }
}