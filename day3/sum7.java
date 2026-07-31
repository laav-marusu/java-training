class  sum7 {
    public static void main(String[] args) {
        int i = 5, j = 5;

        j = i++ * j++ * j++ * j++;
        System.out.println(i);

        j = ++j * ++j * ++j * ++j;
        System.out.println(j);
    }
}