
import java.util.*;

class VacuumBFS {
  //  Constant arrays to look up the result of applying an action to a given state.
  //  For example, looking up state 1 in the actionRight array gives state 2
  //  which is the result of moving right from state 1 (see the diagram in 
  //  unit 2.8)
  static int[] actionLeft= {1,1,3,3,5,5,7,7};
  static int[] actionRight={2,2,4,4,6,6,8,8};
  static int[] actionSuck= {3,6,3,8,7,6,7,8};
  
  //  Returns true when s is a goal state. 
  static boolean goalTest(int s) {
    return (s==7 || s==8);
  }
  
  //  Returns true if there is a solution, i.e. a path from state 1 to 7 or 8. 
  static boolean BFS() {
    int initialState=1;
    if(goalTest(initialState)) {
      return true;
    }
    
    //  frontier initially contains just 1.
    ArrayList<Integer> frontier=new ArrayList<Integer>();
    frontier.add(1);
    //  frontier will be used as a FIFO queue to implement BFS. 
    
    //  explored is initially empty. 
    ArrayList<Integer> explored=new ArrayList<Integer>();
    
    while(true) {
      if(frontier.size()==0) {
        //  There are no more nodes to expand, and we did not find a goal. 
        return false;
      }
      
      //  Remove the first element of frontier
      int node=frontier.remove(0);  
      explored.add(node);
      
      //  Expand 'node'
      //  Make children array containing the three states that
      //  result from applying the three actions to the current state.
      int[] children = {actionLeft[node-1], actionRight[node-1], actionSuck[node-1]};
      
      System.out.println("Expanding node: "+node+" to: "+Arrays.toString(children));
      
      for(int child : children) {
        if(goalTest(child)) {
          System.out.println("Goal state found: "+child);
          return true;
        }
        if( !frontier.contains(child) && !explored.contains(child) ) {
          //  This state has not been seen before.
          //  Add it to the end of the frontier list.
          frontier.add(child);
        }
      }
    }
  }
  
  public static void main(String args []) {
    boolean solutionFound=BFS();
    System.out.println("Solution found: "+solutionFound);
  }
}
