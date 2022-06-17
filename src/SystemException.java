public class SystemException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c  = a/b; 
        } catch (Exception e) {
            System.out.println("Error message: "+e.getMessage());
        }
    }
}
