/*
* page 356
* q: compute all permutations of a string with unique characters
* notes:
*   go char by char, and separate the string into prefix + remainder
*   recursion O(n!)
*/

public ArrayList<String> getPerms(String input){
  ArrayList<String> result = new ArrayList<String>();
  getPerms("", input, result);
  return result;
}

private void getPerms(String prefix, String remainder, ArrayList<String> result){
  if(remainder.length() == 0){  //we have finished building the permutation
    result.add(prefix);
  }

  int length = remainder.length();
  for(int i = 0; i < length; i++){  //as long as there is a remainder, recurse
    //remove a character from the remainder
    String beforeCharC = remainder.substring(0,i);
    String afterCharC = remainder.substring(i+1, length);
    char c = remainder.charAt(i);
    String withoutC = beforeCharC + afterCharC;
    getPerms(prefix + c, withoutC, result);
  }
}
