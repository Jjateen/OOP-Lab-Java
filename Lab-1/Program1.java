public class AverageAndSum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide some numbers as command line arguments.");
            return;
        }

        double sum = 0.0;
        for (String arg : args) {
            try {
                double num = Double.parseDouble(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg);
            }
        }

        int n = args.length;
        double average = sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
