/*
* page 349
* q: return all subsets of a set
* notes:
*   input {1} -> out [{}, {1}]
*   for subset of n, find subset of n-1 and append n to it
*   recursion
*   can also use bit manipulation and have each element &1 once
*/

public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> inputSet){
  if(inputSet == null){
    return null;
  }
  return getSubsets(inputSet, 0);
}

private ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> inputSet, int index){
  ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
  if (index == inputSet.size()){
    allSubsets.add(new ArrayList<Integer>()); //base case, add empty set
    return allSubsets;
  } else{
    allSubsets = getSubsets(inputSet, index+1);
    int element = set.get(index);
    ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
    for(ArrayList<Integer> subset : allSubsets){
      ArrayList<Integer> newSubset = new ArrayList<Integer>();
      newSubset.addAll(subset);
      newSubset.add(element); //the new subset is the previous set + current element
      moreSubsets.add(newSubset);
    }
    allSubsets.addAll(moreSubsets);
  }
  return allSubsets;
}
