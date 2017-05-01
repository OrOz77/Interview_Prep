/*
* page 91
* q: find the first nonrepeated char in a string
* notes:
*   use some sort of hashed data structure to determine if something exists
*/

public static Character firstNonRepeatedChar(String s){
  Map<Character, Integer> map = new HashMap<>();  //char -> # of times it appears

  for(Character c : s.toCharArray()){
    if(map.containsKey(c)){
      map.put(c, map.get(c) + 1); //increment char count by 1 if character was seen before
    } else{
      map.put(c, 1);              //place char in hashmap
    }
  }


  for(Character c : s.toCharArray()){
    if(map.get(c) == 1){
      return c;         //return the first char encountered with a count of 1
    }
  }

  return null;      //no nonrepeated chars found
}
