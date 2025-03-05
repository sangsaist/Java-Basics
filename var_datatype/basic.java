package var_datatype;

/* Data Types in Java:
 * 1. Primitive Data Types: Store actual values
 *    - Used for basic data storage
 *    - Have fixed size
 *    - Performance efficient
 * 
 * 2. Non-Primitive (Reference) Data Types: Store addresses/references
 *    - More complex data structures
 *    - Dynamic size
 *    - Can have methods
 */

public class basic {
    public static void main(String args[]) {
        /* byte: 
         * Size: 1 byte (8 bits)
         * Range: -128 to 127
         * Default value: 0
         * Use: When memory saving is priority and small numbers are needed
         */
        byte byteNum = 127;
        System.out.println("Byte: " + byteNum);

        /* short:
         * Size: 2 bytes (16 bits)
         * Range: -32,768 to 32,767
         * Default value: 0
         * Use: When int is too large but byte is too small
         */
        short shortNum = 32000;
        System.out.println("Short: " + shortNum);

        /* int:
         * Size: 4 bytes (32 bits)
         * Range: -2³¹ to 2³¹-1 (-2,147,483,648 to 2,147,483,647)
         * Default value: 0
         * Use: Most common for whole numbers
         */
        int intNum = 98;
        System.out.println("Integer: " + intNum);

        /* long:
         * Size: 8 bytes (64 bits)
         * Range: -2⁶³ to 2⁶³-1
         * Default value: 0L
         * Use: For very large whole numbers
         * Note: Requires 'L' suffix
         */
        long longNum = 9223372036854775807L;
        System.out.println("Long: " + longNum);

        /* float:
         * Size: 4 bytes (32 bits)
         * Precision: 6-7 decimal digits
         * Default value: 0.0f
         * Use: For decimal numbers with less precision
         * Note: Requires 'f' suffix
         */
        float floatNum = 3.14f;
        System.out.println("Float: " + floatNum);

        /* double:
         * Size: 8 bytes (64 bits)
         * Precision: 15-16 decimal digits
         * Default value: 0.0d
         * Use: For decimal numbers with high precision
         */
        double doubleNum = 3.14159265359;
        System.out.println("Double: " + doubleNum);

        /* char:
         * Size: 2 bytes
         * Range: 0 to 65,535 (Unicode characters)
         * Default value: '\u0000'
         * Use: Stores single characters
         * Note: Uses single quotes
         */
        char letter = 'A';
        System.out.println("Character: " + letter);

        /* boolean:
         * Size: 1 bit
         * Values: true or false only
         * Default value: false
         * Use: For conditional logic
         */
        boolean isTrue = true;
        System.out.println("Boolean: " + isTrue);

        /* String (Non-Primitive):
         * Size: Varies (reference type)
         * Default value: null
         * Use: For text storage
         * Note: Uses double quotes
         * Special features: Immutable, has built-in methods
         */
        String text = "Hello Java!";
        System.out.println("String: " + text);

        /* Array (Non-Primitive):
         * Size: Varies based on type and length
         * Default value: null
         * Use: Store multiple values of same type
         */
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array first element: " + numbers[0]);
    }
}