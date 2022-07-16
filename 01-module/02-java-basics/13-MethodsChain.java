public class App {
    public static void main(String[] args) {
        var name = "hexlet";

        // BEGIN (write your solution here)
        var first = name.substring(0, 1).toUpperCase();
        var rest = name.substring(1).toLowerCase();
        System.out.println(first + rest);
        // END
    }
}
