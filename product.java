
class product {

    int prod(){
        int a = 10;
        int b = 20;
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        product p = new product();
        int result = p.prod();
        System.out.println(result);
    }  
}
