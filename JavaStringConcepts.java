import java.util.StringJoiner;

public class JavaStringConcepts {
    public static void main(String[] args) {
        /*
         * 1. String Immutability
         * */
        System.out.println("1. String Immutability");
        String s = "Hello World!";
        s.toUpperCase();
        System.out.println(s); // output Hello World!
        s = s.toUpperCase();
        System.out.println(s); // output HELLO WORLD!
        // new string object is created and returned by the toUpperCase() method

        /*
         * 2. String pool
         * */
        System.out.println(" 2. String pool");
        String s1 = "cat";
        String s2 = "cat";
        // s1 and s2 point to the same memory reference
        System.out.println(s1 == s2);

        /*
         * 3. intern() method
         * */
        System.out.println("3. intern() method");
        String s3 = new String("hello");
        String s4 = "hello"; // Interned string

        System.out.println(s3 == s4); // false (Different memory locations)

        String s5 = s3.intern(); // Returns reference from the string pool

        System.out.println(s5 == s4); // true (Same memory reference)

        /*
         * 4. String vs StringBuffer
         * */
        System.out.println(" 4. String vs StringBuffer");
        String str = "Hello";
        String str2 = str + " World!"; // Creates a new string object
        System.out.println(str2); // output Hello World!
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!"); // Modifies the same object
        System.out.println(sb); // output Hello World!

        /*
         * 5. String comparison == and .equals()
         * */
        System.out.println("5. String comparison == and .equals()");
        String comp1 = "hello";
        String comp2 = "hello";
        String comp3 = new String("hello");
        System.out.println(comp1 == comp2); // true
        System.out.println(comp1 == comp3); //false
        System.out.println(comp1.equals(comp2)); // true
        System.out.println(comp1.equals(comp3)); // true

        /*
         *  6. compareTo() method
         * */
        System.out.println(" 6. compareTo() method");
        String ctstr1 = "Apple";
        String ctstr2 = "Banana";
        String ctstr3 = "Apple";

        System.out.println(ctstr1.compareTo(ctstr2)); // Negative (-1), "Apple" < "Banana"
        System.out.println(ctstr2.compareTo(ctstr1)); // Positive (1), "Banana" > "Apple"
        System.out.println(ctstr1.compareTo(ctstr3)); // 0, "Apple" == "Apple"

        /*
         * 7. StringJoiner
         * */
        System.out.println("7. StringJoiner");
        StringJoiner joinStrings = new StringJoiner(",", "[", "]");
        // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinStrings.add("one");
        joinStrings.add("two");
        joinStrings.add("three");
        System.out.println(joinStrings);

        /*
         * 8. String methods
         * */
        System.out.println("8. String methods");
        String sentence = "  Java is a powerful programming language.  ";
        String firstWord = "Apple";
        String secondWord = "Banana";
        String mixedCaseWord = "HelloWorld";
        String phrase = "Java Programming";
        String subStringCheck = "powerful";
        String extraSpaces = "   Trim this string!   ";
        String concatenationFirst = "Welcome";
        String concatenationSecond = " to Java!";

        // split(): Splitting string at spaces
        String[] words = sentence.split(" ");
        System.out.println("split():");
        for (String word : words) {
            System.out.println(word);
        }

        // compareTo(): Lexicographical comparison
        System.out.println("\ncompareTo(): " + firstWord.compareTo(secondWord)); // Negative (Apple < Banana)

        // compareToIgnoreCase(): Lexicographical comparison ignoring case
        System.out.println("compareToIgnoreCase(): " + firstWord.compareToIgnoreCase("apple")); // 0 (case ignored)

        // length(): Getting the length of a string
        System.out.println("length(): " + phrase.length()); // 16

        // substring(): Extracting a substring
        System.out.println("substring(): " + phrase.substring(5, 16)); // "Programming"

        // equalsIgnoreCase(): Case-insensitive comparison
        System.out.println("equalsIgnoreCase(): " + firstWord.equalsIgnoreCase("APPLE")); // true

        // contains(): Checking if string contains a substring
        System.out.println("contains(): " + sentence.contains(subStringCheck)); // true

        // trim(): Removing leading and trailing spaces
        System.out.println("trim(): '" + extraSpaces.trim() + "'"); // "Trim this string!"

        // charAt(): Getting character at a specific index
        System.out.println("charAt(): " + phrase.charAt(5)); // 'P'

        // toLowerCase(): Converting to lowercase
        System.out.println("toLowerCase(): " + mixedCaseWord.toLowerCase()); // "helloworld"

        // toUpperCase(): Converting to uppercase
        System.out.println("toUpperCase(): " + mixedCaseWord.toUpperCase()); // "HELLOWORLD"

        // concat(): Concatenating two strings
        System.out.println("concat(): " + concatenationFirst.concat(concatenationSecond)); // "Welcome to Java!"

    }
}
