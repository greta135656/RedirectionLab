import java.util.*;

public class MakeStars {
  public static void main (String[] args){
    Scanner result = new Scanner(System.in);
    while (result.hasNextLine()){
      Scanner line = new Scanner(result.nextLine());
      String out = "";
    while (line.hasNext()){
      String word = line.next();
      for (int i=0; i<word.length(); i++){
        out += "*";}
        if(line.hasNext()) {
     out += " ";
      }
    }
    System.out.println(out);
    
  }}}


