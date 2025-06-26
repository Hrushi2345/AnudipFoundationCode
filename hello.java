import java.util.*;
class hello{

    public static int add(int a, int b){
        return a + b;
    }

    hello() {
        System.out.println("This is a constructor");
    }


    
    int add(){
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }


    public static void main(String[] args){
        demo d1 = new demo();
        int sum1 = d1.add();
        System.out.println("Sum is: " + sum1);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("Sum is " + sum);
    }
}
class demo{
    int add(){
        int a = 10;
        int b = 20;
        int c = a * b;
        return c;
    }
}