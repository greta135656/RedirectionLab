//PigLatin.java
import java.util.*;
public class PigLatin {
  public static void main(String[]args){
    
public static String pigLatinSimple(String s){
  s = s.toLowerCase();
  if (s.charAt(0) == 'a' || 
      s.charAt(0) == 'u' || 
      s.charAt(0) == 'o' || 
      s.charAt(0) == 'i' || 
      s.charAt(0) == 'e') {
    return s + "hay";
  }
  return s.substring(1) + s.charAt(0) + "ay";
   }
}


  public static String pigLatin(String s){
    s = s.toLowerCase();
    if (s.length() < 2){
  return pigLatinSimple(s);}
  
    String [] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", 
                        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", 
                        "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", 
                        "th", "tr", "tw", "wh", "wr"}

      for (int i = 0; i < digraph.length; i ++){
      if(s.substring(0,2).equals(digraph[i])){

        return s.substring(2) + s.substring(0,2) + "ay";
      }
    }
    return pigLatinSimple(s);}


    public static String pigLatinBest(String s){}}}
