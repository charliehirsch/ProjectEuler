import java.util.*;
public class ProblemFour{
  public static void main(String[] args){


    System.out.println("\n" + "Problem Four:");
    System.out.println("Find the largest palindrome made from the product of two 3-digit numbers.");
    System.out.println("The largest palindrome is " + String.format("%,d", getLargestPalindrome(3)) + ".\n");
    
  }

    public static int getLargestPalindrome(int digitCount){
      int toReturn = 0;
      for (int i = 100; i<1000; i++){
        for (int j = 100; j<1000; j++){
          if (isPalindrome(i*j)){
            int test = i*j;
            if (test>toReturn){
              toReturn=test;
            }
          }
        }
      }
      return toReturn;
    }

    public static boolean isPalindrome(int test){
      String toTest = test + "";
      String firstHalf = getFirstHalf(toTest);
      String backwardsSecondHalf = getSecondHalf(toTest);
      if (firstHalf.equals(backwardsSecondHalf)){
        return true;
      }
      return false;
    }

    public static String getFirstHalf(String number){
      String toReturn = "";
      if (number.length()%2==0){
        for (int i = 0; i<number.length()/2; i++){
         toReturn+=number.charAt(i);
        }
      }
      else{
        for (int i = 0; i<number.length()/2; i++){
          toReturn+=number.charAt(i);
        }
      }
      return toReturn;
    }

    public static String getSecondHalf(String number){
      String toReturn = "";
      if (number.length()%2==0){
        for (int i = number.length()-1; i>=number.length()/2; i--){
          toReturn+=number.charAt(i);
        }
      }
      else{
        for (int i = number.length()-1; i>number.length()/2; i--){
          toReturn+=number.charAt(i);
        }
      }
      return toReturn;
    }

}