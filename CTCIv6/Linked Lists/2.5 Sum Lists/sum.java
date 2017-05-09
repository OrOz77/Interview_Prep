/*
* page 214
* q: given 2 LL representing REVERSED ints, sum them up
*    return as a LL also reversed
* q2: perform the same with integers in forward order
* notes:
*/

public ListNode addLL(ListNode h1, ListNode h2){
  boolean carryFlag = false;
  int sum = 0;
  ListNode result = null;

  while(h1.next != null && h2.next != null && !carryFlag){
    sum = carryFlag ? 1 : 0;
    if(h1 != null){
      sum +=
    }
  }
}
