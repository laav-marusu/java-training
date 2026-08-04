import java.util.Scanner;
class array11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        int charcount[] = new int[128];
        int dup = 0;
        for(char c : s.toCharArray())
        {
            charcount[c]++;
        }
        for(int cnt : charcount)
        {
            if(cnt > 1)
            {
                dup++;
            }
        }
        System.out.println("Duplicate  : " + dup);
    }
}