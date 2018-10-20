/** Project Euler: This program finds the nth prime number.
 * BUG: isPrime again takes way too long.
 */
public class Problem7 {
    public static boolean isPrime(long x) {
        if (x == 1) {return false;}
        if (x == 2 || x == 3) {return true;}
        long factor = 2;
        while (factor < x) {
            if (x % 2 == 0) {return false;}
            if (x % factor == 0) {return false;}
        }
        return true;
    }
    public static long nthPrime(int n) {
        int numPrime = 0;
        long currNum = 2;
        while (numPrime < n) {
            if (isPrime(currNum)) {numPrime ++;}
            currNum++;
        }
        return currNum;
    }
}