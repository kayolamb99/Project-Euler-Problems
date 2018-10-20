/**Project Euler: Find the sum of the digits in the number 2^1000.
 *
 */
public class Problem16 {
    public static void main(String[] args) {
        double num = Math.pow(2,1000); double sum = 0;
        while (num < 0) {
            sum += num % 10;
            num /= 10.0;
        }
        System.out.println(sum);
    }
}
