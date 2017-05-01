/*
* page 73
* q: given two nodes, find the lowest common ancestor (parent). assume both nodes exist
* notes:
*   in a BST, the parent must have a value in between the two given nodes to be valid
*   use above fact to search tree
*   start at root node because it must be the first ancestor
*/

public Node findLowestAncestor(Node root, Node child1, Node child2){
  while(root != null){
    int value = root.data;

    //if the root value is > both children, then we need to go left (aka decrease root)
    if(value > child1.data && value > child2.data){
      root = root.left;
    }
    //if the root value is < both children, then we need to go right (aka increase root)
    else if(value < child1.data && value < child2.data){
      root = root.right;
    }
    //we have reached the node with a value in between child1 and child2
    else{
      return root;
    }
  }

  return null;  //empty tree

}
