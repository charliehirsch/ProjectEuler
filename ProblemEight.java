public class ProblemEight{
  public static void main(String[] args){

    System.out.println("\n" + "Problem Eight:");
    System.out.println("There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.");
    System.out.println("The product is " + getPythagTrip(1000) + ".\n");

  }

    public static int getPythagTrip(int sum){

      for (int a = 1; a<sum; a++){
        for (int b = 2; b<sum; b++){
          for (int c = 3; c<sum; c++){
            if (a+b+c==sum && c>b && b>a && a*a + b*b == c*c){
              return a*b*c;
            }
          }
        }
      }
      return -1;
    }



}