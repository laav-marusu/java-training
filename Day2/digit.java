import java.util.Scanner;
class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        if(no >= 0 && no <= 10) {
            System.out.println(no + " is a single digit number.");
        }
        else if(no>=10 && no<=100){
            System.out.println(no + " is a two digit number.");
        }
        else if(no>=100 && no<=1000){
            System.out.println(no + " is a three digit number.");
        }
        else if(no>=1000 && no<=10000){
            System.out.println(no + " is a four digit number.");
            
        } else {
            System.out.println("out of range");
        }
    }
}
