/**
 * testDriver - main class that tests the class ArrayDictionary
 * Author: Lilly Phan
 * Date (last edited): 01/31/2023
 **/

public class testDriver {
    public static void main(String[] args) {
        //testing size, isEmpty, and constructor
        ArrayDictionary<String, Integer> dict = new ArrayDictionary<>();
        System.out.println("0: " + dict.size());
        System.out.println("true: " + dict.isEmpty());

        //testing put
        dict.put("A", 1);
        System.out.println("vv This key already exists. vv");
        dict.put("A", 1);
        dict.put("B", 2);
        System.out.println("2: " + dict.size());
        System.out.println("false: " + dict.isEmpty());

        //testing get
        System.out.println("1: " + dict.get("A"));
        System.out.println("2: " + dict.get("B"));
        System.out.println("null: " + dict.get("a"));

        //testing remove
        System.out.println("1: " + dict.remove("A"));
        System.out.println("null: " + dict.remove("C"));
        System.out.println("1: " + dict.size());

        //testing contains
        System.out.println("true: " + dict.contains("B"));
        System.out.println("false: " + dict.contains("C"));

        //testing put
        dict.put("C", 3);
        dict.put("D", 4);
        dict.put("Lilly", 14);

        //testing keys and values
        System.out.println("[B, C, D, Lilly]: " + dict.keys());
        System.out.println("[2, 3, 4, 14]: " + dict.values());
    }
}
