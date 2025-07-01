abstract class cot {
    abstract void run();
    
    cot(){
        System.out.println("This is Constructor");
    }
}

class demo extends cot {
    demo(){
        System.out.println("This is Constructor of demo");
    }
    public void run(){
        System.out.println("This is run method");
    }
    public void fly(){
        System.out.println("This is fly method");
    }
}

class cons{
    public static void main(String[] args) {
        demo d = new demo();
    }
}