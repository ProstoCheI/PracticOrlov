import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ID:0766
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        if (n * k >= m) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}