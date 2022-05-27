import java.util.*;


class last-stone-weight {
  public static void main(String args[]) {
	  int[] stones= {1};
	  PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	  
      for(int i=0;i<stones.length;i++)
      {
          pq.add(stones[i]);
      }
      System.out.print(pq);
      while(pq.size()>2)
      {
          int y=pq.poll();
          int x=pq.poll();
          if(x!=y)
          {
              pq.add(y-x);
          }
      }
      if(pq.size()==2)
      {
          int y=pq.poll();
          int x=pq.poll();
          System.out.print( y-x);
      }
      System.out.print( pq.poll());
  }
}
