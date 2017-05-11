/*
* page 241
* q: given a directed graph, return is there is a route between 2 nodes
* notes:
*   BFS (requires Queue)
*   need to mark nodes as visited, use a Hashset if Node class cannot contain state
*/

public static boolean hasRoute(Node start, Node end){
  Queue<Node> q = new LinkedList<>();
  HasSet<Node> set = new Set<>();
  if(start == end){
    return true;
  }
  q.add(start);

  while(!q.isEmpty()){
    Node tmp = q.remove(); //dequeue, get top element
    if(tmp == end){
      return true;
    }
    if(!set.contains(tmp)){
      set.add(tmp);
      for(Node n : tmp.getChildren()){
        q.add(n);
      }
    }
  }

  return false;
}
