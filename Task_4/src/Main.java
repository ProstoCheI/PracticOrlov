import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ID:0025
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(">");
        }
        else if (a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("=");
        }
    }
}