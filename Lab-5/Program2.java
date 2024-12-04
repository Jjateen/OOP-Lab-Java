public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Outer Try Block");
            
            try {
                System.out.println("Inner Try Block");
                System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: Array index out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch block: An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
