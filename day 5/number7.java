import java.util.Scanner;
class number7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int no = sc.nextInt();
        int sum=0;
        if(no<1)
            System.out.println("Perfect number");
        else{
            for(int i=1;i<no;i++)
            {
                if(no%i==0)
                sum=sum+i;
            }
        }
        if(sum==no)
            System.out.println("Perfect number");
        else
        System.out.println("No Perfect number");
    }
}