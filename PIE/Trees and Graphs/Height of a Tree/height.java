/*
* page 69
* q: find the maximum height of a tree given a node
* notes:
*   height of a tree is the height of its tallest subtree + 1
*   recursion
*/

public static int treeHeight(Node n){
  if (n == null){
    return 0; //base case
  }

  return 1 + Math.max(treeHeight(n.left), treeHeight(n.right)); //1 + max of either side

}
