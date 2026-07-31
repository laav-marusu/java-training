 class sum4 {
    public static void main(String[] args) {
        int i = 6;

        switch (i) {
            default:
                i += 2;
            case 4:
                i = 4;
            case 5:
                i++;
                break;
        }

        System.out.println(i);
    }
}    
    

