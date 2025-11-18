package Result;

import java.util.HashMap;
import java.util.Map;

public class PermMissingElem {
    /*
     * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
     * PermMissingElem
     */
    public static int solution(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : A) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i = 1; i <= A.length+1; i++) {
            if(!map.containsKey(i)) return i;
        }

        return -1;
    }
}
