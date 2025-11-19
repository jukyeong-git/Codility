package Result;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {
    /*
     * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
     * FrogRiverOne
     */
    public static int solution(int X, int[] A) {
        // Implement your solution here
        if (A.length < X) return -1;

        boolean[] seen = new boolean[X + 1];
        int remaining = X;

        for (int t = 0; t < A.length; t++) {
            int pos = A[t];
            if (!seen[pos]) {
                seen[pos] = true;
                if (--remaining == 0) return t;
            }
        }
        return -1; // 끝까지 못 덮음
    }
}
