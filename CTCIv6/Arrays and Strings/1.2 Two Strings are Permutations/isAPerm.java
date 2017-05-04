/*
* page 193
* q: given two strings, determine if they are a permutation of one another
* notes:
*   permutation means it contains the same letters and amount
*/

//NOTE: this question can be solved with less space overhead if using an int[256] instead of a map!
public boolean isAPermutation(String s1, String s2){
  if(s1.length() != s2.length()){
    return false; //length must be equal to be a permutation
  }

  Map<Character, Integer> characterMapping = new HashMap<>(); //holds a count of each char

  //go through first string
  for(char c : s1.toCharArray){
    if(characterMapping.containsKey(c)){
      characterMapping.put(c, characterMapping.get(c) + 1); //increment count if char exists
    } else{
      characterMapping.put(c, 1);
    }
  }

  //go through second string
  for(char c : s2.toCharArray){
    if(characterMapping.containsKey(c)){
      characterMapping.put(c, characterMapping.get(c) - 1); //decrement count if char exists
      if(characterMapping.get(c) < 0){  //if the updated count is ever negative, then return false
        return false;
      }
    } else{
      return false; //a new character was found...i.e not a permutation!
    }
  }

  return true;
}
