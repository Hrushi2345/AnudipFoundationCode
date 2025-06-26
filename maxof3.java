
import java.util.Scanner;

class maxof3{
    public static void MaxOfThree(int a, int b, int c){
        if(a>b & a>b){
            System.out.println(a + " is Greater");
        }else{
            if(b>c & b>a){
                System.out.println(b + " is Greater");
            }else{
            System.out.println(c + " is Greater");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        MaxOfThree(a, b, c);
    }
}