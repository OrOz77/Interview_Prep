/*
* page 345
* q: a robot is in a r x c grid and can move only down and to the right
*     some cells are off limits (markde with 1)
*     find a path for the robot from top left to bottom right
* notes:
*   backtrack from the bottom right
*   recurse
*   decrease big O by using a cache to check for visited
*/


public ArrayList<Point> findPath(int[] grid){
  if(grid == null || grid.length == 0){
    return null;
  }
  ArrayList<Point> path = new ArrayList<>();
  HashMap<Point, boolean> visitedPoints = new HashMap<>();
  if(hasPath(grid, grid.length-1, grid[0].length-1, path, visitedPoints)){ //work backwards
    return path;
  }
  return null;
}

//start from the bottom right
private boolean hasPath(int[][] grid, int currentR, int currentC,
      ArrayList<Point> path, HashMap<Point, boolean> visitedPoints){

  if(currentC < 0 || currentR < 0 || grid[currentR][currentC] == 1){
    return false; //not a valid movement
  }

  Point tmp = new Point(currentR, currentC);

  if(visitedPoints.containsKey(tmp)){
    return visitedPoints.get(tmp);  //return the value of the point we already calculcated
  }

  boolean success = false;

  if(currentR == 0 && currentC == 0){
    path.add(new Point(0,0));
    success = true; //base case. made it to the top left
  }

  if(hasPath(grid, currentR-1, currentC, path)){  //going up is valid
    path.add(new Point(currentR, currentC));
    success = true;
  }

  if(hasPath(grid, currentR, currentC-1, path)){  //going left is valid
    path.add(new Point(currentR, currentC));
    success = true;
  }

  visitedPoints.put(p, success);
  return success;
}
