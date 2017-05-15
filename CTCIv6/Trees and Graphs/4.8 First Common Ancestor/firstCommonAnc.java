/*
* page 257
* q: find common ancestor of two nodes in a binary tree (not balanced!)
* notes:
*   i assume a link to the parent exists
*/


//O(n^2) where we go through the whole chain for each parent of the other
public Node getAncestor(Node a, Node b){
  if (a == b){
    return null;
  }

  Node ancestor = a;

  while(ancestor != null){
    if(isOnPath(ancestor, b)){
      return ancestor;
    }
    ancestor = ancestor.parent;
  }
  return null;
}

private boolean isOnPath(Node ancestor, Node n){
  while(n != ancestor && n != null){
    n = n.parent;
  }
  return n == ancestor;
}
