/*
* page 246
* q: implement a function to check if a binary tree is a BST
* notes:
*   BST means left is less than right
*   if inorder traversal, all elements must be increasing in value
*/

//using fact that inorder has elements incease
public boolean isBST(Node root){
  int[] arrayOfInOrder = new int[root.size];
  bstToArray(root, arrayOfInOrder);
  for(int i = 1; i < arrayOfInOrder.length; i++){
    if(arrayOfInOrder[i] <= arrayOfInOrder[i-1]){
      return false;
    }
  }
  return true;
}

//recursive inorder traversal
private int index = 0
private void bstToArray(Node root, int[] array){
  if(root == null){ //base case
    return;
  }
  bstToArray(root.left, array);
  array[index] = root.data;
  index++;
  bstToArray(root.right, array);
}

//////////
//using fact that left elements are less than right elements
public boolean isBST(Node root){
  return isBST(root, null, null);
}

private boolean isBST(Node root, int min, int max){
  if(n == null){
    return true;
  }
  if((min != null && n.data <= min) || (max != null && n.data >= max)){
    return false;
  }
  if(!isBST(root.left, min, n.data) || !isBST(root.right, n.data, max)){
    return false;
  }

  return true;
}
