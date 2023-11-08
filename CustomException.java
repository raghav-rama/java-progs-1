public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            if (b == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed");
            }
            int c = a / b;
            System.out.println("The result is " + c);
        } 
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("End of program.");
        }
    }
}

