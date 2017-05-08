/*
* page 203
* q: given an NxN matrix, rotate by 90 degress. in place?
* notes:
*  90 degree rotation
*  rotate layer by layer
*/

public void rotateImage(int[][] matrix){
  int tmp;

  for(int layer = 0; layer < matrix.length / 2; layer++){
    int first = layer;
    int last = matrix.length - 1 - first;

    for(int i = first; i < last; i++){
      int offset = i - first;

      //save top
      int top = matrix[first][i];

      //left -> top
      matrix[first][i] = matrix[last-offset][first];

      //bottom -> left
      matrix[last-offset][first] = matrix[last][last-offset];

      //right -> bottom
      matrix[last][last-offset] = matrix[i][last];

      //top -> right
      matrix[i][last] = top;
    }
  }
}
