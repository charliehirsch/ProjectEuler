public class ProblemTwo{
  public static void main(String[] args){

    int sumEvenFibs = addEvenFibs(1,4000000);

    System.out.println("\n" + "Problem Two:");
    System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
    System.out.println("The sum is " + String.format("%,d", sumEvenFibs) + ".\n");

  }

  public static int addEvenFibs(int start, int end){
    int sum = 0;
    int i = start;
    int j = 1;
    int nextFib = 0;
    while (nextFib<=end){
      if (nextFib%2==0){
        sum+=nextFib;
      }
    nextFib=i+j; 
    j=i;
    i=nextFib; 
    }
    return sum;
  }

}