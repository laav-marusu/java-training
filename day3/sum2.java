class sum2 {
    public static void main(String[] args) {
        int i = 0;

        if (i++ == 1) {
            System.out.println(++i);
        } else {
            System.out.println(--i + " " + --i);
        }
    }
}     