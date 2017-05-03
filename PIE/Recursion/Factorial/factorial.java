/*
* page 108
* q: use recursion to calculate a factorial of n
* notes:
*   base case: n = 0 or 1, return 1
*/

public static int factorial(int n){
  if(n <= 1){
    return 1; //base case
  } else{
    return factorial(n-1) * n;  //multiply itself with n-1 factorial
  }
}
