import java.util.ArrayList;

/** Project Euler: This program finds the sum of all the Fibonacci terms less than 4 million. */
public class Problem2 {
    public static ArrayList<Integer> generateFib() {
        int count = 1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1); res.add(2); int val = 0;
        while (val < 4 * (Math.pow(10, 6))) {
            val = (res.get(count - 1) + res.get(count));
            res.add(val);
            count++;
        }
        return res;
    }
    public static int getEvenSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                sum += arr.get(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = Problem2.generateFib();
        int res = Problem2.getEvenSum(arr);
        System.out.println("The sum of the even integers in the Fibonacci sequence is " + res);
    }
}
