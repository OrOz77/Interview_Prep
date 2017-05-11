/*
* page 242
* q: given a sorted array with unique ints, write an algorithm to create
*     a BST with minimal height
* notes:
*   use binary search to build tree
*   recurse on smaller subset
*/

public static Node createBST(int[] sortedArray){
  //call wrapper for binary search to work
  createBST(sortedArray, 0, sortedArray.length);
}

private static Node createBST(int[] sortedArray, int left, int right){
  int middle = (left+right) / 2;
  Node n = new Node(sortedArray[middle]);
  if(left >= right){
    return null;
  }else{
    n.left = createBST(sortedArray, left, middle-1);
    n.right = createBST(sortedArray, middle+1, right);
    return n;
  }
}
