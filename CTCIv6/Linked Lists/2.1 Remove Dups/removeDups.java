/*
* page 208
* q: remove all duplicates from a linked list,
     also can it be done without a buffer?
* notes:
*   todo without buffer, we need a secondary runner. time O(n^2) in that case
*/

//with buffer (using hash)
public ListNode removeDups(ListNode head){
  HashSet<Integer> set = new HashSet<>();
  ListNode runner = head;
  ListNode prev = null;

  if(head == null){
    return head;
  }

  while(runner.next != null){
    if(set.contains(runner.data)){
      //remove runner node
      prev.next = runner.next;
      runner.next = null;
      runner = prev.next;
    } else{
      set.add(runner.data);
      prev = runner;
      runner = runner.next;
    }

    return head;
  }
}
