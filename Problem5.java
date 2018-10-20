/** Project Euler: This program find the smallest possible number evenly divided by a range of numbers.
 *
 */
public class Problem5 {
    public static long getNumber() {
        long count = 1; long res = 1;
        while (count < 21) {
            if (res % count == 0) {res++; count++;}
            else {count = 1;}
        }
        return res;
    }
}