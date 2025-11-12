package Result;

public class CyclicRotation {
    /*
     * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
     * CyclicRotation
     */
    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int N = A.length;
        if (N == 0) return A;            // 빈 배열: 그대로 반환

        int r = K % N;                   // 유효 회전 수
        if (r == 0) return A;            // 회전 후 동일

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[(i + r) % N] = A[i];
        }
        return B;
    }
}
