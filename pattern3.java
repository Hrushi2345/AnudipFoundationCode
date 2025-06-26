class pattern3 {
    public static void main(String[] args) {
        int m = 5;
        int i,j;
        for(i = 0; i <= m; i++) {
            System.out.println("");
            for(j = 0; j <= m; j++){
                if(i<=j){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
           }
        }
    }
}
