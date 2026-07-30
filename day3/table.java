import java.util.Scanner;

class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int no=sc.nextInt();
        System.out.print("Enter a table: ");
        int t=sc.nextInt();
        for(int i=1;i<=no;i++){
            System.out.println(i+"*"+ t +"="+(i*t));
        }
    }
}