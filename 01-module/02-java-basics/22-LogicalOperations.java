import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN (write your solution here)
    public static boolean isPalindrome(String str) {
        return StringUtils.reverse(str).equalsIgnoreCase(str);
    }
    // END
}
