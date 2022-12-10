import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class testMaps {
    public static void main(String[] args) {
        Map<String, Integer> luni = new HashMap<>();
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }}
        System.out.println(luni);
    }
}
// nu afiseaza!!!
