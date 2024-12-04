public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
