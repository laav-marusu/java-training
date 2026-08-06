class ps {

    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);

        boolean prime = true;

        if (n < 2)
            prime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.printf("%.2f", Math.sqrt(n));
        else
            System.out.printf("0.00");
    }
}