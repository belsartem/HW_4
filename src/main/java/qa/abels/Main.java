package qa.abels;

public class Main {
    public static void main(String[] args) {

        // Primitive Data Types
        System.out.println("\n### PRIMITIVE DATA TYPES ###\n");

        // Integers
        byte aByte = 1;
        short aShort = -2456;
        int aInt = 32567988;
        long aLong = 435431855;

        System.out.println("# Byte: Size 1B. Stores whole numbers from -128 to 127");
        System.out.println("# Short: Size 2B. Stores whole numbers from -32768 to 32767");
        System.out.println("# Int: Size 4B. Stores whole numbers from -2^31 to 2^31 -1");
        System.out.println("# Long: Size 8B. Stores whole numbers from -2^63 to 2^63 -1\n");

        // Floating points
        float aFloat = 0.0F;
        double aDouble = 0.00;

        System.out.println("# Float: Size 4B. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
        System.out.println("# Double: Size 8B. Stores fractional numbers. Sufficient for storing 15 decimal digits\n");

        // Characters
        char aChar = 'x';

        System.out.println("# Char: Size 2B. Stores a single character/letter or ASCII values\n");

        // Boolean Type
        boolean aBoolean = true;

        System.out.println("# Boolean: Size 1b. Stores true or false values\n");

        // Object Types (String and many others)
        System.out.println("### OBJECT DATA TYPE ###\n");

        // String Type
        String helloWorld = "Hello world!";

        System.out.println("# Object Types contain Strings and many more\n");

        // Arithmetical Operators
        System.out.println("### EXAMPLES OF MATHEMATICAL OPERATORS ###\n");

        int a = 5;
        int b = 2;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Examples of logical operators
        System.out.println("\n### EXAMPLES OF LOGICAL OPERATORS ###\n");

        boolean x = true;
        boolean y = false;

        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Comparison examples
        System.out.println("\n### COMPARISONS EXAMPLES ###\n");

        System.out.println("Equality comparison: " + (a == b));
        System.out.println("Inequality comparison: " + (a != b));
        System.out.println("Greater than comparison: " + (a > b));
        System.out.println("Less than comparison: " + (a < b));
        System.out.println("Greater than or equal to comparison: " + (a >= b));
        System.out.println("Less than or equal to comparison: " + (a <= b));

        // Overflow example
        System.out.println("\n### OVERFLOW EXAMPLE ###\n");

        int maxInt = Integer.MAX_VALUE;
        int overflowedValue = maxInt + 1;
        System.out.println("Overflow: " + overflowedValue + "\n");

        // Examples of type combinations
        System.out.println("### EXAMPLES OF TYPE COMBINATIONS ###\n");

        int intValue = 5;
        double doubleValue = 2.5;

        double result1 = intValue + doubleValue;
        System.out.println("Addition of int and double: " + result1);

        double result2 = intValue - doubleValue;
        System.out.println("Subtraction of double from int: " + result2);

        double result3 = intValue * doubleValue;
        System.out.println("Multiplication of int and double: " + result3);

        double result4 = intValue / doubleValue;
        System.out.println("Division of int by double: " + result4);
    }
}