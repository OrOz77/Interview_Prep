/*
* page 71
* q: traverse a tree preorder iteratively
* notes:
*   recursion = stack
*   type of DFS
*   runtime O(n) since every node is visited once
*/

public void preorderTraversal(Node n){
  Stack<Node> nodeStack = new Stack<>();

  nodeStack.push(n);  //place initial node in stack

  while(!nodeStack.isEmpty()){  //continue while something exists in the nodeStack
    Node current = nodeStack.pop(); //get current node

    //do preorder stuff
    print(current); //visit
    if(current.left != null){
      nodeStack.push(current.left); //left
    }
    if(current.right != null){
      nodeStack.push(current.right); //right
    }

  }

}
