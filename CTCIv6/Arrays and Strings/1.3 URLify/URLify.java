/*
* page 194
* q: using a char array, replace all spaces with '%20'
* notes:
*   i am given the true length of the string
*   cant use stringbuilder
*/

public String URLify(String input, int trueLength){
  //init char array of size true length
  char[] result = new char[input.length()];
  int index = 0;  //use an index to keep track of location in result[]

  for(int i = 0; i < trueLength; i++){
    if(input.charAt(i) == ' '){ //replacement conditions
      //i = %, i+1 = 2, i+2 = 0
      result[index] = '%';
      index += 1;
      result[index] = '2';
      index += 1;
      result[index] = '0';
    } else{
      result[index] = input.charAt(i);
    }
    index++;
  }

  return new String(result);
}
