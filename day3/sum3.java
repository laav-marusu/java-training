class sum3 {
    public static void main(String[] args) {
        int i = 1, j = 0;

        if ((i -= j) != 0)
            System.out.println(-i);
        else
            System.out.println(++j);
    }
}