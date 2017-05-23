/*
* page 354
* q: given 3 towers and N disks, move disks from first tower to the last (3rd)
* notes:
*   this code is only a brief explanation of the algorithm
*/

public voic moveDisks(int n, Tower destination, Tower buffer){
    if(n > 0){
      moveDisks(n-1, buffer, destination);
      moveTopTo(destination);
      buffer.moveDisks(n-1, destination, this);
    }
}

public void moveTopTo(Tower t){
    int top = stack.pop();
    t.add(top);
}
