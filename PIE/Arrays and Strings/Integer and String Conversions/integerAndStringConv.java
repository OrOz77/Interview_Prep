/*
* page 101
* q: write 2 conversion routies
      #1: converts a string to a signed int (assume only digits or '-')
      #2: converts an int into a string
* notes:
*   check pictures
*/

//#1
public int stringToInt(String s){
  int result = 0;
  boolean negativeFlag;

  //handle the first character in case a negative sign appears
  if(s.charAt(0) == '-'){
    negativeFlag = true;
  } else{
    result += s.charAt(0) - '0';  //ascii substraction
  }

  //start at 1 because 0 was checked manually above
  for(int i = 1; i < s.length; i++){
    result *= 10; //multiply by 10 to get the correct decimal spot
    results += s.charAt(i) - '0';
  }

  if(negativeFlag){
    result = -result; //negate result
  }

  return result;
}

//#2
public String intToString(int x){
  String result = "";
  boolean negativeFlag = x < 0 ? true : false;

  if(negativeFlag){
    x = -x; //flip x because % operation does not behave consistently with negative values in all languagues
  }

  while(x != 0){  //reached when no digits remain
    result = x%10 + result; //%10 gives the digit furthest on the right. need to PREPEND
    x /= 10;                //dividing by 10 shrinks x by one power of 10
  }

  if(negativeFlag){
    result = '-' + result;  //prepend a negative sign if needed
  }

  return result;
}
