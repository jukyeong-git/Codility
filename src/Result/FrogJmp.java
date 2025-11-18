package Result;

public class FrogJmp {
    /*
     * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
     * FrogJmp
     */
    public static int solution(int X, int Y, int D) {
        // Implement your solution here
        int count = 0;
        int dist = Y - X;

        if(dist <= 0) return count;

        if(dist%D == 0 && dist >= D)
            count = dist/D;
        else
            count = dist/D + 1;

        return count;

    }
}
