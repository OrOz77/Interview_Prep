/*
* page 97
* q: write a function that reverses the order of the words in a string
* notes:
*   space is the delimiter
*/

public String reverseWords(String s){
  StringBuilder sb = new StringBuilder();
  Stack<String> strings = new Stack<>();

  for(char c : s.toCharArray){
    if(c == ' '){
      strings.push(sb.toString());  //push old string to stack
      sb = new StringBuilder(); //clear sb
    } else{
      sb.append(c);
    }
  }

  strings.push(sb.toString());  //push the final word, because sentences do not end with a space
  sb = new StringBuilder(); //clear one last times

  while(!strings.isEmpty()){
    sb.append(strings.pop()); //append strings from stack
    sb.append(' '); //add a space between words
  }

  return sb.toString();
}
