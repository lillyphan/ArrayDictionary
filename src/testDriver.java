public class testDriver {
    public static void main(String[] args) {
        ArrayDictionary<String, Integer> dict = new ArrayDictionary<>();
        System.out.println("0: " + dict.size());
        System.out.println("true: " + dict.isEmpty());

        dict.put("A", 1);
        System.out.println("vv This key already exists. vv");
        dict.put("A", 1);
        dict.put("B", 2);
        System.out.println("2: " + dict.size());
        System.out.println("false: " + dict.isEmpty());

        System.out.println("1: " + dict.get("A"));
        System.out.println("2: " + dict.get("B"));
        System.out.println("null: " + dict.get("a"));

        System.out.println("1: " + dict.remove("A"));
        System.out.println("null: " + dict.remove("C"));
        System.out.println("1: " + dict.size());
    }
}
