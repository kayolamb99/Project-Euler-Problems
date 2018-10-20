/** Project Euler: This program finds the difference between the sum of the squares
 * of the first n natural numbers and the square of the sum of the first
 * n natural numbers.
 */
public class Problem6 {
    public static long sumOfSquares() {
        long sum = 0; long currNum = 1;
        while (currNum < 101) {
            sum += Math.pow(currNum, 2);
            currNum ++;
        }
        return sum;
    }
    public static long squareOfSums() {
        long sum = 0; long currNum = 1;
        while (currNum < 101) {
            sum += currNum;
            currNum ++;
        }
        return (long)Math.pow(sum, 2);
    }
    public static void main(String[] args) {
        System.out.println("The difference in sum of  squares is " + (Problem6.squareOfSums() - Problem6.sumOfSquares()));
    }
}