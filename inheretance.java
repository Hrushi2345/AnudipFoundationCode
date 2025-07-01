class parent {
    
    void add(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a and b is : "+c);
    }
}

class child extends parent{

    void mul(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("Multiplication of 10 and 20 is " + c);
    }
}

class inheretance{
    public static void main(String[] args) {
        child c = new child();
        c.add();
    }
}