/*
* page 343
* q: a child can go up a staircase 1, 2, or 3 steps at a time
*    implement a method to find how many ways he can climb n stairs
* notes:
*   DP saves computation time
*   regular recursion will by O(3^n)
*/

//unoptimized
public int countSteps(int n){
  if(n < 0){
    return 0;
  } else if(n == 0){ //base case
      return 1;
  } else{
      return countSteps(n-1) + countSteps(n-2) + countSteps(n-3);
  }
}

//with dp (ie keeping track of previous calculations)
public int countSteps(int n){
  int[] memo = new int[n+1];
  Arrays.fill(memo, -1);
  return countStepsMemo(n, memo);
}

private int countStepsMemo(int n, int[] memo){
  if(n < 0){
    return 0;
  } else if(n == 0){
    return 1;
  } else if(memo[n] != -1){
    return memo[n];
  } else{
      memo[n] = countStepsMemo(n-1, memo) + countStepsMemo(n-2, memo) + countSteps(n-3, memo);
      return memo[n];
  }
}
