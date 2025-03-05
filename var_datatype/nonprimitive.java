package var_datatype;
// Program to Store and Print Different Non-Primitive Data Types
import java.util.ArrayList;
import java.util.HashMap;
public class nonprimitive {
    static String name = "leo das";  // String 
    static int[] numbers = {96, 69, 78, 99, 48};  // Array 
    static ArrayList<String> Staff = new ArrayList<>();  // ArrayList 
    static HashMap<String, Integer> marks = new HashMap<>();  // HashMap 
    
    public static void main(String[] args) {
        // Adding values to ArrayList
        Staff.add("sangsai");
        Staff.add("sanjay");
        Staff.add("manoj");

        // Adding values to HashMap
        marks.put("DBMS", 90);
        marks.put("DS", 85);
        marks.put("JAVA", 88);

        // Printing Non-Primitive Data Types
        System.out.println("Name: " + name);
        System.out.print("Numbers Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Staff List: " + Staff);
        System.out.println("Marks Map: " + marks);
    }
}
