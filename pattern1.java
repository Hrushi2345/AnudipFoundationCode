class pattern1 {
    
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int i,j;
        for(i = 0; i <= n; i++) {
            System.out.println("");
            for(j = 0; j <= m; j++){
                if(i==0||j==0||j==m||i==n){
                    System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
           }
        }
    }
}
