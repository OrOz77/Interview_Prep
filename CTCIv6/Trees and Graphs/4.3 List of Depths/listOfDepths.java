/*
* page 243
* q: given a binary tree, design an algorithm which creates a LL of
*    all nodes at each depths
* notes:
*   level order traversal (BFS)
*   use Queue
*/

public ArrayList<LinkedList<Node>> getListOfDepths(Node root){
  ArrayList<LinkedList<Integer>> listOfDepths = new ArrayList<LinkedList<Integer>>();
  if(root == null){
    return listOfDepths;
  }


  LinkedList<Node> current = new LinkedList<Node>();
  LinkedList<Node> next = new LinkedList<Node>();

  current.add(root);

  while(!current.isEmpty()){  //go while q contains elements
    listOfDepths.add(current);
    LinkedList<Node> parents = current;
    current = new LinkedList<Node>();

    for(Node n : parents){
      //add left and right children to next of q
      if(node.left != null)
          current.add(n.left);
      if(node.right != null)
          current.add(n.right);
    }
  }
  return listOfDepths;
}
