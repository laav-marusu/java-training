// Spiral Matrix - I

import java.util.Scanner;
class Spiral1_day8
{
public static void main(String args[]) // step 1
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter No :");
int no=sc.nextInt(); // Step 2
int matrix[][]=new int[no][no];
int r,c,num=1;
for(r=0;r<(no+1)/2;r++) // Step 3
{
     for(c=r;c<no-r;c++)  // Fill Top rows - Step 4
     {
     matrix[r][c] = num++;
     }
     for(c=r+1;c<no-r;c++)  // Fill Right cols - Step 5
     {
     matrix[c][no-r-1] = num++;
     }
    for(c=no-r-2;c>=r;c--)  // Fill Last cols - Step 6
     {
     matrix[no-r-1][c] = num++;
     }
     for(c=no-r-2;c>r;c--)  // Fill First cols - Step 7
     {
     matrix[c][r] = num++;
     }
}
for(r=0;r<no;r++) // Step 3 - Displaying Matrix
{
    for(c=0;c<no;c++)
    {
    System.out.print(matrix[r][c] + "\t");
    }
  System.out.println("\n");
}
int pp=1;
System.out.println("(0,0)");
for(r=0;r<no;r++) // To print Powerpoints
{
    for(c=0;c<no;c++)
    {
    if(matrix[r][c]%11==0)
    {
    System.out.println("("+ r + "," + c + ")");
    pp++;
    }
   }
}
System.out.println("Total Power points : " + pp);
}}