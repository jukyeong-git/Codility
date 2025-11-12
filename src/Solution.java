import Result.BinaryGap;
import Result.CyclicRotation;
import Result.OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /*
         * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
         * BinaryGap
         */
//        int N = 32;
//
//        int result = BinaryGap.solution(N);

        /*
         * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
         * CyclicRotation
         */
//        int[] A = {3, 8, 9, 7, 6};
//        int K = 3;
//
//        int[] result = CyclicRotation.solution(A, K);
//
//        System.out.println(Arrays.toString(result));

        /*
         * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
         * OddOccurrencesInArray
         */
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        int result = OddOccurrencesInArray.solution(A);

        System.out.println(result);
    }
}