import java.util.HashSet;
import java.util.Set;

public class AddCheck {
    public static void main(String[] args)
    {

        Set<Integer> ids = new HashSet<>();

        
        System.out.println(ids.add(10)); // true
    
        System.out.println(ids.add(20)); // true
    
        System.out.println(ids.add(10)); // false (duplicate)
    
        System.out.println(ids.add(null)); // true
    
        System.out.println(ids.add(null)); // false

        System.out.println(ids);
    }
}