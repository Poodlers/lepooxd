import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (operation.equals("mul")){
            System.out.println(a * b);
        }
        else{
            System.out.println(a + b);
        }

        scanner.close();
    }
}