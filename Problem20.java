/** This prgoram finds the sum
 * of the digits of a given number
 * in factorial form.
 * BUG: Stops working around 32, number
 * format exception. Need to resolve.
 *
 */

import java.util.Scanner;
public class Problem20 {
    public static int sumDigits(int x) {
        String xAsString = Integer.toString(x);
        int curr = 0; int sum = 0;
        while(curr < xAsString.length()) {
            sum += Integer.parseInt(xAsString.substring(curr, curr + 1));
            curr++;
        }
        return sum;
    }
    public static int factorial(int x) {
        int res = x; int curr = x - 1;
        while (curr > 0) {
            res *= curr;
            curr--;
        }
        return res;
    }
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number.");
        //int num = input.nextInt();
        int x = sumDigits(factorial(32));
        System.out.println(x);
    }
}
