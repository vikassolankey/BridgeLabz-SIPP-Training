
import java.util.Scanner;

public class SubStringCheck {

   public static String subStringMaker(String str, int startIdx, int endIdx){
      String subString = "";
      for(int i = startIdx; i<= endIdx; i++){
         subString += str.charAt(i);
      }
      return subString;
   }

   public static boolean isEqual(String subString1 , String subString2){
      boolean result= true;
      if(subString1.length() != subString2.length()){
         return false ;
      }
      for (int i=0; i<subString1.length(); i++){
        if ( subString1.charAt(i)!= subString2.charAt(i)){
         result = false;
        }
      }
      return result;
   }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int startIdx = input.nextInt();
    int endIdx = input.nextInt();

    String subString1 = subStringMaker(str ,startIdx, endIdx);
    String subString2 = str.substring(startIdx, endIdx);

    boolean result = isEqual(subString1, subString1);
    System.out.println(result);





   } 
}
