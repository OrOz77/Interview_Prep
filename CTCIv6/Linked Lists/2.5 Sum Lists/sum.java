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
    sum = carryFlag ? 1 : 0;  //use carry flag
    if(h1 != null){ //add first LL if possible
      sum += h1.data;
      h1 = h1.next;
    }
    if(h2 != null){ //add second LL if possible
      sum += h2.data;
      h2 = h2.next;
    }
    if(sum > 9){  //checks for carry
      sum = sum%10; //grab only the ones digit
      carryFlag = true;
    }
    ListNode tmp = new ListNode(sum); //create resulting ListNode
    result.next = tmp;
    result = result.next;

    sum = 0;
  }
  //NOTE this will not return the head of the list, need to fix
  return result;
}
