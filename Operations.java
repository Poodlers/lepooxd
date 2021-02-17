import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        if (operation.equals("mul")){
            result = a * b;
        }
        else{
            result = a + b;
        }
        System.out.println("Result: " + String.valueOf(result));
        scanner.close();
    }
}
