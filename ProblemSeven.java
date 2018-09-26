public class ProblemSeven{
  public static void main(String[] args){

    System.out.println("\n" + "Problem Seven:");
    System.out.println("What is the 10 001st prime number?");
    System.out.println("The 10,001st prime is " + String.format("%,d", getPrime(10001)) + ".\n");
    System.out.println(isPrime(104760));
  }

  public static int getPrime(int number){
    int primeCounter = 0;
    int i = 2;
    while (primeCounter < number){
      if (isPrime(i)){
        primeCounter++;
      }
      i++;
    }
    return i-1;
  }

  public static boolean isPrime(int test){
      int i=2;
      while (i<=Math.sqrt(test)){
        if (test%i==0){
          return false;
        }
        i++;
      }
      return true;
    }

}