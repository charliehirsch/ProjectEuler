public class ProblemFive{
  public static void main(String[] args){

    System.out.println("\n" + "Problem Five:");
    System.out.println("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");
    System.out.println("The smallest positive number is " + (getSmallestEvenlyDivisble(1,20) +  ".\n"));
  }

  public static int getSmallestEvenlyDivisble(int start, int end){
    int test = end + 1;
    int temp = start+1;
    while (temp<21){
      if (isDivisibleBy(test, temp)){
        temp++;
      }
      else{
        test++;
        temp=1;
      }
    }
    return test;
  }

  public static boolean isDivisibleBy(int numerator, int denominator){
    if (numerator%denominator==0){
      return true;
    }
    else{
      return false;
    }
  }

}