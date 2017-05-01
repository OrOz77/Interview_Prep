/*
* page 94
* q: given a string str and string remove, delete all chars in 'remove' from 'str'
* notes:
*   the chars in remove != a substring of str. they are a collection of chars that should be deleted
*/


//SOLUTION WITH TEMPORARY STRING BUFFER
public String removeChars(String str, String remove){
  HashSet<Character> removalChars = new HashSet<>();
  StringBuilder sb = new StringBuilder();

  //iterate through remove to add to the set
  for(int i = 0; i < remove.length(); i++){
    removalChars.add(remove.charAt(i));
  }

  //only append to string those that shouldnt be removed
  for(int i = 0; i < str.length(); i++){
    if(!removalChars.contains(str.charAt(i))){
      sb.append(str.charAt(i));
    }
  }

  return sb.toString();

}

//SOLUTION IN PLACE BY OVERWRITING ORIGINAL STRING
public String removeChars(String str, String remove){
  char[] strArray = str.toCharArray();
  char[] removeArray = remove.toCharArray();
  int source, destination = 0;

  //128 ASCII mapped to boolean array
  boolean[] flags = new boolean[128];

  //set correct flags
  for(source = 0; source < removeArray.length; ++source){
    flags[removeArray[source]] = true;
  }

  //loop through string and only copy those that arent flagged
  for(source = 0; source < strArray.length; ++source){
    if(!flags[strArray[source]]){
      strArray[destination] = strArray[source];
      destination++;
    }
  }

  //return a new string of only the chars between index 0 and destination
  return new String(strArray, 0, destination);
}
