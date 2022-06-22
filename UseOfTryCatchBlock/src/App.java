
public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("C = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
