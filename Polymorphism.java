class Polymorphism {

    void print(){
        System.out.println("This is print1 method");
    }
    
    void print(int a){
        System.out.println("This is print1 method with int parameter");
    }

    void print(String a){
        System.out.println("This is print1 method with String parameter");
    }

    public static void main(String[] args) {
        Polymorphism Poly = new Polymorphism();
        Poly.print();
        Poly.print(10);
        Poly.print("Hello");
    }
}
