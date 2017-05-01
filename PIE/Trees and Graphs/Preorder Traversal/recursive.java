/*
* page 70
* q: traverse a tree preorder with recursion
* notes:
*   visit, goLeft, goRight
*   runtime O(n) since every node is visited once
*/

public void preorderTraversal(Node n){
  if (n == null){
    return;
  }

  print(n); //print pre
  preorderTraversal(n.left);  //go left
  preorderTraversal(n.right); //go right

}


/*
* note:
*   INORDER = goLeft, visit, goRight
*   POSTORDER = goLeft, goRight, visit
*/
