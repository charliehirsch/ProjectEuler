public class ProblemTwo{
  public static void main(String[] args){

    int sumEvenFibs = addEvenFibs(0,40);

    System.out.println("\n" + "Problem Two:");
    System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
    System.out.println("The sum is " + String.format("%,d", sumEvenFibs) + ".\n");

  }

  public static int addEvenFibs(int start, int end){
    int sum = 0;
    for(int i=start; i<=end; i+=i){
      if (i%2==0){
        sum+=i;
      }
    }
    return sum;
  }

}