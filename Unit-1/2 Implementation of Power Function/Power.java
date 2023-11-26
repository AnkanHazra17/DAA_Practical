import java.util.Scanner;

public class Power{

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if (exponent % 2 == 0) {
            int temp = power(base, exponent / 2);
            return temp * temp;
        } else {
            int temp = power(base, (exponent - 1) / 2);
            return base * temp * temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Exponent:");
        int exponent = sc.nextInt();
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
        
    }
}