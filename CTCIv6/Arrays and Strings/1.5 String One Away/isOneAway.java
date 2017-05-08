/*
* page 199
* q: one away = you can insert, remove, or replace 1 char in a string,
    given two strings, find if they are "one away"
* notes:
*/

public boolean isOneAway(String s1, String s2){
  switch(Math.abs(s1.length() - s2.length())){
    case 0 :
      return equalLengths(s1, s2);
      break;
    case 1 :
    //determine the longer vs shorter string
      String shorterS = s1.length() <= s2.length() ? s1 : s2;
      String longerS = s1.length() > s2.length() ? s1 : s2;
      return diffLength(shorterS, longerS);
      break;
    default :
      return false;
  }
}

private boolean equalLengths(String s1, String s2){
  boolean oneEditFlag;
  for(int i = 0; i < s1.length(); i++){
    if(oneEditFlag == true){
      return false;
    }
    //can only have one character be different, so use a flag
    if(s1.charAt(i) != s2.charAt(i)){
      oneEditFlag = true;
    }
  }

  return oneEditFlag;
}

private boolean diffLength(String shorterS, String longerS){
  int shorterIndex = 0;
  boolean oneEditFlag;

  for(int i = 0; i < longerS.length(); i++){
    if(shorterS.charAt(shorterIndex) == longerS.charAt(i)){
      shorterIndex++;
    } else{
      if(oneEditFlag == true){
        return false;
      }
      oneEditFlag = true;
    }
  }

  return oneEditFlag;
}
