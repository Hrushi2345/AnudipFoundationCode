class pattern5 {
    public static void main(String[] args) {
        int m = 5;
        int i,j;
        int num = 1;
        for(i = 0; i <= m; i++) {
            System.out.println("");
            for(j = 0; j <= i; j++){
                System.out.print(num+" ");
                num++;
           }
        }
    }
}
