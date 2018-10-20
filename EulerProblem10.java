public class EulerProblem10 {
 
 public static boolean isPrime(long x) {
  if (x == 0 || x == 1) {return false;}
  long factor = 2;
  while (factor < x) {
   if (x % factor == 0) {return false;}
   }
  return true;
 }

 public static long summationUpToN(long n) {
  long sum = 0; long currNum = 2; 
  while (currNum < n) {
   if (EulerProblem10.isPrime(currNum)) {
    sum += currNum;
   }
  currNum++;
  }
  return sum;
 }

 public static void main(String[] args) {
  System.out.println("The sum of all primes below 2,000,000 is " + EulerProblem10.summationUpToN((long)(2 * Math.pow(10, 6))));
 }
}