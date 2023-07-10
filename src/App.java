import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        // Check if a string is empty or null
        String str = null;
        boolean isEmpty = StringUtils.isEmpty(str);
        
        // Capitalize the first letter of a string
        String str2 = "hello world";
        String capitalized = StringUtils.capitalize(str2);        

        System.out.println("Is the string empty? " + isEmpty);
        System.out.println("Capitalized string: " + capitalized);
    }
}