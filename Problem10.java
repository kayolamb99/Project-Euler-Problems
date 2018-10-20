/**Project Euler: Find the sum of all the primes
 * below two million. Again, isPrime
 * takes too long, need a faster method.
 */
public class Problem10 {
    public static void main(String[] args) {
        int sum = 2; int curr = 3;
        while (curr < 2 * Math.pow(10, 6)) {
            if (MathUtils.isPrime(curr)) {sum += curr;}
        }
        System.out.print(sum);
    }
}
