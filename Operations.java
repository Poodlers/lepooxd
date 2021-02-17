import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Result: " + String.valueOf(a + b));
        scanner.close();
    }
}
