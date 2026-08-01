import java.util.Scanner;
class number3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();
        int f1=0,f2=1,f3=0;
        for(int i=1; i<=no;i++){
            System.out.print(f1+" ");
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.println(f3 + " ");
        }
    }
}