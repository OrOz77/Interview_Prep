/*
* page 248
* q: given a node, find the next one (inorder successor)
*    each node has a link to its parent
* notes:
*    return the leftmost node on the right subtree
*    if there is no right subtree, we need to go up to the next parent
*/

public Node getSuccessor(Node n){
  if(n == null){
    return null;
  }
  if(n.right != null){
    return getLeftMostChild(n.right);
  } else{
    Node q = n;
    Node x = q.parent;
    //Go up until we're on left instead of right
    while(x != null && x.left != q){
      q = x;
      x = x.parent;
    }

    return x;
  }
}

private Node getLeftMostChild(Node n){
  if(n == null){
    return null;
  }
  while(n.left != null){
    n = n.left;
  }

  return n;
}
