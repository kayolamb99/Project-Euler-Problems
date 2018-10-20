/** Project Euler: This program finds the sum of all the multiples of 3 or 5 below 1000 **/
public class Problem1 {
    public static long findMultiples(int n) {
        long res = 0; long start = 3;
        while (start < n) {
            if (start % 3 == 0 || start % 5 == 0) {
                res += start;
            }
            start++;
        }
        return res;
    }
}
