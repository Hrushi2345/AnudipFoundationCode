class pattern4 {
    public static void main(String[] args) {
        int m = 5;
        int i,j;
        for(i = 0; i <= m; i++) {
            System.out.println("");
            for(j = m; j >= 0; j--){
                if(i<j){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
           }
        }
    }
}
