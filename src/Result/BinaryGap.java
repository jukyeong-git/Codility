package Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryGap {
    /*
     * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
     * BinaryGap
     */
    public static int solution(int N) {
        // Implement your solution here
        int count = 0, result = 0;
        List<Integer> binary = new ArrayList<>();
        boolean flag = false;

        while(N !=0 && N !=1) {
            binary.add(N%2);
            N /= 2;
        }

        binary.add(N);

        for(int i = 0; i < binary.size(); i++) {
            if(binary.get(i) == 1) {
                flag = true;
                result = Math.max(result, count);
                count = 0;
            } else if(flag)
                count++;
        }

        return result;
    }
}
