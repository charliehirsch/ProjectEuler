public class ProblemThree{
  public static void main(String[] args){

   double largestPrimeFactor = findLargestPrimeFactor(600851475143.0);

    System.out.println("\n" + "Problem Three:");
    System.out.println("What is the largest prime factor of the number 600851475143?");
    System.out.println("The largest prime factor is " + String.format("%,f", largestPrimeFactor) + ".\n");
    
  }

   public static double findLargestPrimeFactor(double end){
      double i = 2;
      double toReturn = 0;
      while (i<Math.sqrt(end)){
        if (isPrime(i) && end%i==0){
          toReturn=i;
        }
        i++;
        System.out.println(i);
      }
      return toReturn;
    }

    public static boolean isPrime(double test){
      double i=2;
      while (i<Math.sqrt(test)){
        if (test%i==0){
          return false;
        }
        i++;
      }
      return true;
    }
}