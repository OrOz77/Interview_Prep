/*
* page 244
* q: given a binary tree, check if it is balanced (subtree heights differ <= 1)
* notes:
*   getHeight(left) and getHeight(right)
*/

public boolean isBalanced(Node root){
  if(root == null){
    return true;
  }

  int heightDiff = getHeight(root.left) - getHeight(root.right);
  if(Math.absolute(heightDiff) > 1){
    return false; //cannot have a diff > 1
  } else{
    //need to check left and right subtree
    return isBalanced(root.left) && isBalanced(root.right);
  }
}

private int getHeight(Node n){
  if (n == null){
    return 0; //base case
  }
  return 1 + Math.max(getHeight(n.left), getHeight(n.right));
}
