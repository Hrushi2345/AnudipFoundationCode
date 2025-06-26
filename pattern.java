class pattern {
    
    void PyramidPattern(){
        int n = 5;
        int i, j;
        for (i = 0;i<=n;i++){
            System.out.println("");
            for (j = 0;j<=i;j++){
                System.out.print("* ");
            }
        }
    }

    void SquarePattern(){
        int n = 5;
        int i, j;
        for (i = 0;i<=n;i++){
            System.out.println("");
            for (j = 0;j<=n;j++){
                System.out.print("* ");
            }
        }
    }

    public static void main(String[] args) {
        pattern p = new pattern();
        p.SquarePattern();
        System.out.println("\n \n --------------------------- \n");
        p.PyramidPattern();
    }

}
