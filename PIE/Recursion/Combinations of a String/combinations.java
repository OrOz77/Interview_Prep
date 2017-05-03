/*
* page 116
* q: use recursion to find all combinations of a string (ie almost powerset)
* notes:
*   look at bit manipulation in the same folder
*/

//solution copied from PIE, I am still not very comfortable with operating
public class Combinations{
  private StringBuilder sb = new StringBuilder();
  private final String in;

  public Combinations(final String input){
    in = input;
  }

  public void combine(){
    combine(0);
  }

  //wrapper for generating combinations
  //requires the starting index of combinations and the string to operate on (class global)
  public void combine(int startingIndex){
    for(int i = startingIndex; i < in.length(); ++i){
      sb.append(in.charAt(i));  //append current letter
      System.out.println(sb); //print
      if(i < in.length()){
          combine(i+1); //recurse with the next index if its inbounds
      }
      sb.setLength(sb.length() - 1);  //remove the last char added
    }
  }
}
