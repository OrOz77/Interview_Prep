/*
* page 111
* q: use recursion to perform binary search on a sorted array. returns index of target
* notes:
*   iterative may be easier in this case!
*/

public int binarySearch(int[] array, int target){
  //call wrapper for recursion; requires a min and max
  return binarySearch(array, target, 0, array.length-1);
}

//overloaded wrapper
public int binarySearch(int[] array, int target, int lowerBound, int upperBound){
  int range = upperBound - lowerBound;

  //error checking
  if(range < 0){
    throw new exception("upper is less than lower!");
  } else if(range == 0 && array[lowerBound] != target){
    throw new exception("element not in array!");
  }
  if(array[lowerBound] > array[upperBound]){
    throw new exception("array isnt sorted!");
  }

  //binary search recursion
  //find center
  int center = (range/2) + lowerBound;

  if(array[center] == target){
    return center;
  } else if(array[center] < target){
    //lowerBound needs to be increased
    //lowerBound = center + 1;
    return binarySearch(array, target, center + 1, upperBound);
  } else {
    //upperBound needs to be decreased
    //upperBound = center - 1;
    return binarySearch(array, target, lowerBound, center - 1);
  }




}
