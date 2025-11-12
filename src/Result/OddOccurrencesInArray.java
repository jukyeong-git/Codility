package Result;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    /*
     * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
     * OddOccurrencesInArray
     */
    public static int solution(int[] A) {
        // Implement your solution here

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : A) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()) {
            if(map.get(i)%2 != 0)
                return i;
        }

        return 0;
    }
}
