class pattern2 {
    public static void main(String[] args) {
        int m = 5;
        int i,j;
        for(i = 0; i <= m; i++) {
            System.out.println("");
            for(j = m; j >= i; j--){
                System.out.print("* ");
           }
        }
    }
}
