import java.util.Scanner;

class leapyear {
    public static void LeapYear(int year){
        if((year % 4 == 0 & year % 100 != 0)||(year % 400 == 0)){
            System.out.println(year + " is Leap Year");
        }else{
            System.out.println(year + " Is Not Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        LeapYear(Year);
    }
}
