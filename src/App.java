import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = keyboard.nextInt();
            System.out.println("Your age is "+age);

            if (age < 18) {
                throw new InvalidAge();
            }
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
