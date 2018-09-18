public class Commify{

  public static void main(String[] args){
    String toPrint = commify(5192379);
    System.out.println(toPrint);

  }

  public static String commify(int num){
      String toReturn = Integer.toString(num);
      return toReturn;
  }

}