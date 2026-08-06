import java.util.Scanner;
class Perfect_number_day8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int num = sc.nextInt();
        int sum=0;
        if(num<1)
        System.out.println("Perfect number");
        else{
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                sum=sum+i;
            }
        }
        if(sum==num)
        System.out.println("Perfect number");
        else
            System.out.println("No Perfect number");
    }
}