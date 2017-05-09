/*
* page 212
* q: given a value x, partition a LL so all nodes with values
     less than x come before nodes greater than x
* notes:
*   only need to place the less than nodes before x
*/

public ListNode partition(ListNode head, int x){
  ListNode beforeX = head;
  ListNode afterX = head;

  ListNode runner = head;

  //go through whole LL, place on appropriate ListNode
  while(runner.next != null){
    ListNode tmp = runner.next; //keep track of next value so we can continue iterating
    if(runner.value < x){
      runner.next = beforeX;
      beforeX = runner;
    } else{
      runner.next = afterX;
      afterX = runner;
    }
    runner = tmp;
  }

  afterX.next = null;

  return beforeX;
}
