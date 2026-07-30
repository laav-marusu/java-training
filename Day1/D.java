class D
{
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}