import java.util.Arrays;
import java.util.Scanner;
class array9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();
        int arr1[] = new int[no];
        int arr2[] = new int[no];
        System.out.print("Enter elements of Array1 : ");
        for(int i=0; i<no; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter elements of Array2 : ");
        for(int i=0; i<no; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int flag = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<no; i++)
        {
            if(arr1[i] == arr2[i])
            {
                flag = 0;
            }
            else
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Same Arrays");
        }
        else
        {
            System.out.println("Arrays are not same");
        }
    }
}