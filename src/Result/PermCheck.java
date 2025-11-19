package Result;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {
    /*
     * https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
     * PermCheck
     */
    public static int solution(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : A) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int i = 1; i <= A.length; i++) {
            if(map.get(i) == null) return 0;
        }

        return 1;
    }
}
