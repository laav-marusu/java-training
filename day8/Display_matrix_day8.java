import java.util.Scanner;
class Display_matrix_day8
{
public static void main(String args[]) // step 1
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter No :");
int no=sc.nextInt(); // Step 2
int size = 2 * no-1;
int matrix[][]=new int[no][no];
int r,c,num;
for(r=0;r<size;r++) // Step 3
{
  for(c = 0; c<size;c++) {
    num = Math.min(Math.min(r,c), Math.min(size - 1, size - 1-c));
  }
}
for(r=0; r<size;r++) {
  for(c=0; c < size;c++) {
    System.out.print(matrix[r][c] + " ");
  }
  }
}
}

    