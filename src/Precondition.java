import java.util.Scanner;

public class Precondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m;
        do {
            System.out.println("enter number > 10");
            m = scan.nextInt();
        } while (m < 10);

        while (m >= 10){
            System.out.println(m);
            m--;
        }
    }
}
