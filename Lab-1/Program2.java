public class TypeCastingDemo {
    public static void main(String[] args) {
        // Explicit casting (narrowing)
        double doubleValue = 45.67;
        int intValue = (int) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value: " + intValue);

        // Implicit casting (widening)
        int x = 10;
        double y = x;
        System.out.println("Int value: " + x);
        System.out.println("Double value: " + y);
    }
}