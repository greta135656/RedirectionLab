//PigLatin.java
import java.util.*;
public class PigLatin {
  public static void main(String[]args){
    Scanner new1 = new Scanner(System.in);
    while (new1.hasNextLine()){
      Scanner line = new Scanner(new1.nextLine());
      while (line.hasNext()){
        System.out.print(pigLatinBest(line.next()));
        if(line.hasNext()){
          System.out.print("");
        }
      }
      if(new1.hasNextLine()){
        System.out.println();
      }
    }}

    
public static String pigLatinSimple(String s){
  String result = s.toLowerCase();
  if (result.charAt(0) == 'a' || 
      result.charAt(0) == 'u' || 
      result.charAt(0) == 'o' || 
      result.charAt(0) == 'i' || 
      result.charAt(0) == 'e') {
    return s + "hay";
  }
  return result.substring(1) + result.charAt(0) + "ay";
   }



  public static String pigLatin(String s){
    String result = s.toLowerCase();
    if (result.length() < 2){
  return pigLatinSimple(s);}
  
    String [] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", 
                        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", 
                        "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", 
                        "th", "tr", "tw", "wh", "wr"};

      for (int i = 0; i < digraph.length; i ++){
      if(result.substring(0,2).equals(digraph[i])){

        return result.substring(2) + result.substring(0,2) + "ay";
      }
    }
    return pigLatinSimple(s);}


    public static String pigLatinBest(String s){
      String result = s.toLowerCase();

      if(!Character.isLetter(result.charAt(0)))
      return result;
      if(
      (!(result.charAt(s.length() - 1) >= '0' 
      && result.charAt(s.length() - 1) <= '9')) &&
      !Character.isLetter(result.charAt(result.length()-1)))
      return pigLatin(s.substring(0, s.length() - 1)) +
              result.charAt(s.length() - 1);
              return pigLatin(result);}
      
      



      
      }
