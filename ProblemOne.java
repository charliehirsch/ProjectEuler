public class ProblemOne {
  public static void main(String[] args){
    System.out.println("\n" + "Problem One:");
    System.out.println("Find the sum of all the multiples of 3 or 5 below 1000.");
    int sum3and5 = addMult3and5(0,1000);
    System.out.println("The sum is " + String.format("%,d", sum3and5) + ".\n");
  }

  public static int addMult3and5(int start, int end){
    int sum=0;
    for (int i = start; i<=end; i++){
        if (i%3 == 0 || i%5 == 0){
          sum+=i;
        }
    }
    return sum;
  }    

}