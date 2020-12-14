import java.util.Scanner;
public class FactorialMethod {

    public static int Factorial(int n ){
        int value = 1;

        while (n > 0){
            value = value * n;
            n--;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println(Factorial(m));
    }


}
