import java.util.Scanner;

class evenodd {
    public static void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is Even Number:");
        }else{
            System.out.println(num + " is Odd Number:");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
