import java.util.Scanner;
class array8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();
        int arr[] = new int[no];
        int act=0;
        for(int i=0; i<no; i++)
        {
            arr[i] = sc.nextInt();
            act = act + arr[i];
        }
        no = no + 1;
        int exp = no * (no+1)/2;
        System.out.println("Missing Number : " + (exp - act));
    }
}