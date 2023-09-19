public class HundredthPrime
{
   public static void main(String[] args)
   {
      int currentNumber = 1;
      int primeNumbers = 1;
      while (primeNumbers <= 100) {
         for (int divisor = 2; divisor <= currentNumber; divisor++) {
            if (divisor == currentNumber) {
               primeNumbers++;
            }
         }
         currentNumber++;
      }
      System.out.println(currentNumber);
   }
}