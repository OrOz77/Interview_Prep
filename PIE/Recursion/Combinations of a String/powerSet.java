/*
* page n/a
* q: find the powerset of an input set
* notes:
*   similar to combinations, but includes the empty set
*   uses bit manipulation
*   total of 2^n - 1 sets
*/

public void printPowerSet(char[] inputSet){
  int setSize = inputSet.length;
  int powerSetSize = (int)Math.pow(2, setSize);


  for(int i = 0; i < powerSetSize; i++){  //go through each of the 2^n combinations
    System.out.print("{");
    //print current set
    for(int j = 0; j < setSize; j++){ //go through each 'bit'
      //check of jth bit and i are both set (== 1)
      //if both set, then print that element
      if((i & (1 << j)) > 0){ //shift left bit 1 over j times
        System.out.print(inputSet[j] + " ");
      }
    }
    System.out.println("}"); //new line because inner loop complete
  }
}
