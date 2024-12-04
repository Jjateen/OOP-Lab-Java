public class PrimeNumberTest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean isPrime = isPrimeNumber(num);

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}