import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetColor
{
    public static void main(String[] args) {

        Set<String> colors = new LinkedHashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");   // duplicate
        colors.add(null);    // allowed once
        colors.add(null);    // ignored

        System.out.println(colors);
    }
}