/*
* page 113
* q: use recursion to find all of the permuations of an input string
* notes:
*   fix a substring, and rotate the rest of the string
*/


public static void permute(String input){
  //wrapper for permutations
  permute("", input);
}

private static void permute(String fixedLetters, String remainingSubstring){
  int n = remainingSubstring.length();

  //base case, there are no more letters to rotate
  if(n == 0){
    System.out.println(fixedLetters);
  } else{
    for(int i = 0; i < n; i++){ //iterate through the remaining letters
      String newFixedLetters = fixedLetters + remainingSubstring.charAt(i); //add the current char
      String remaining = remainingSubstring.substring(0,i) + remainingSubstring.substring(i+1, n);  //take away the letter added to prefix
      permute(newFixedLetters, remaining);

    }
  }
}
