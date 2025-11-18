package Result;

public class TapeEquilibrium {
    /*
     * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
     * TapeEquilibrium
     */
    public static int solution(int[] A) {
        // Implement your solution here

        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        for(int i = 0; i < A.length-1; i++) {
            leftSum += A[i];
            rightSum = totalSum - leftSum;
            diff = Math.min(diff, Math.abs(leftSum-rightSum));
        }

        return diff;
    }
}
