/*
* page 211
* q: given only access to a middle node, delete it
* notes:
*
*/

public ListNode deleteNode(ListNode middleNode){
  if(middleNode == null){
    return;
  }
  ListNode tmp = middleNode;
  tmp.next = middleNode.next;
  middleNode.next = null;

  return tmp;
}
