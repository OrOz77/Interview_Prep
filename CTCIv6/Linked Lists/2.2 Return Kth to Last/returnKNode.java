/*
* page 209
* q: return the kth to last element of a LL
* notes:
*   advance a runner k times, check when it hits end, then return second runner
*/

public ListNode getKthNode(ListNode head, int k){
  if(head == null){
    return null;
  }

  ListNode runner = head;
  ListNode returner = head;
  int counter = 0;

  while(runner.next != null){
    if(counter == k){
      returner = returner.next;
    } else{
      counter++;
    }
      runner = runner.next;
  }

  return k == counter ? returner : null;
}
