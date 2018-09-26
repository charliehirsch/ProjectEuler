public class ProblemSix{
  public static void main(String[] args){

    System.out.println("\n" + "Problem Six:");
    System.out.println("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.");
    System.out.println("The difference is " + diff(1,100) +".\n");

  }

  public static int diff(int start, int end){
    int toReturn = squareSums(start, end) - sumSquares(start, end);
    return toReturn;
  }

  public static int sumSquares(int start, int end){
    int toReturn=0;
    for (int i = start; i<=end; i++){
      toReturn += i*i;
    }
    return toReturn;
  }

  public static int squareSums(int start, int end){
    int toReturn = 0;
    for (int i = start; i<=end; i++){
      toReturn+=i;
    }
    return toReturn*toReturn;
  }

}