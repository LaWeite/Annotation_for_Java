import java.util.Scanner;
import java.util.function.Function;

public class MyJavaClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text -> 
            String.format("%s|%s|%s|%s", sender, receiver, text, signature);

        System.out.println(emailFormatter.apply(scanner.nextLine()));

        scanner.close();
    }
}
