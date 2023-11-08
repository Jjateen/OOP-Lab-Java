class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public int length() {
        return str.length();
    }

    public String concatenate(String other) {
        return str + other;
    }

    public boolean equals(String other) {
        return str.equals(other);
    }

    public String reverse() {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public int countOccurrences(String subString) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString("Hello, World!");

        System.out.println("Length: " + myString.length());
        System.out.println("Concatenated: " + myString.concatenate(" How are you?"));
        System.out.println("Equals 'Hello, World!': " + myString.equals("Hello, World!"));
        System.out.println("Reversed: " + myString.reverse());
        System.out.println("Occurrences of 'o': " + myString.countOccurrences("o"));
    }
}
