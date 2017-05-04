/*
* page 192
* q: determine if a string has all unique characters
* notes:
*   can use hashset + boolean
*   can use boolean[256] to represent chars
*   assume ASCII 256
*/

public boolean isUnique(String s){
  if(s.length() >  256){
    return false;   //pigeon hole: there must be a repeated char!
  }

  boolean[] charsUsed = new boolean[];

  for(char c : s.toCharArray()){
    if(charsUsed[c]){
      return false; //if the index is true, it means it was seen before
    }
    charsUsed[c] = true;
  }

  return true;  //return true if every character has been checked
}
