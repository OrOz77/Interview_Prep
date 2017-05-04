/*
* page 195
* q: given a string, check if it is a permutation of a palindrome
* notes:
*   use fact that palindrome has even numbers of each char, unless odd length
*/

//NOTE: can shorten this to 1 method, if we set the boolean flag depending on odd/even!
public boolean isPalindromePermutation(String input){
  if((input.length() & 1) == 1){ //check if length is odd with bit manipulation
    return oddLengthChecker(input);
  } else{
    return evenLengthChecker(input);
  }
}

//if a string contains an odd num of characters, each char except one has a pairing
private boolean oddLengthChecker(String input){
    Map<Character, Integer> result = getCharMap();
    boolean flag;

    for(Integer count : result.getValueSet()){
      if(count % 2 != 0){
        if(flag == true){
          return false;
        } else{ //toggle the flag
          flag  = true;
        }
      }
    }

    return true;
}

//if a string contains an even num of characters, each char has a pairing
private boolean evenLengthChecker(String input){
    Map<Character, Integer> result = getCharMap();

    for(Integer count : result.getValueSet()){
      if(count % 2 != 0){
        return false;
      }
    }

    return true;
}

private HashMap<Character, Integer> getCharMap(String input){
  Map<Character, Integer> result = new HashMap<>();
  for(char c : input.toCharArray()){
    if(result.containsKey(c)){
      result.put(c, result.get(c) + 1); //increment current count by 1
    } else{
      result.put(c, 1); //place 1
    }
  }

  return result;
}
