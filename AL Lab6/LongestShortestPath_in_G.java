package hw6;
import loader.LongestPathAbstract;
import java.util.*;


public class LongestShortestPath_in_G extends LongestPathAbstract {
	public boolean marked[];
    public int [] edgeTo;
    public int [] distTo;
    public static int answer;
    public static void main(String[] args) {
    	
    	LongestShortestPath_in_G Test=new LongestShortestPath_in_G();
    	int []edge={1,2,1,6,1,3,2,4,4,6,3,5,5,6,2,1,6,1};
    	answer=Test.LongestShortestPath(edge);
    	System.out.print("LongestShortestPath:");
    	System.out.println(answer);
    	
        
    	
    }
    public LongestShortestPath_in_G(){
    	marked=new boolean[1000000];
    	distTo=new int    [1000000];
    	edgeTo=new int    [1000000];
  
    }
    
    public int LongestShortestPath(int[] edgelist) {
    	int max=0;
    	int n=find_V(edgelist);
    	LongestShortestPath_in_G T[] = new LongestShortestPath_in_G[n+1];
		for(int i=1;i<=n;i++){
			T[i]=new LongestShortestPath_in_G();
		if(T[i]. LongestShortestPath(edgelist,i)>max) max=T[i]. LongestShortestPath(edgelist,i);
		}
    	return max;
    }
    
	public int LongestShortestPath(int[] edgelist,int x) {
		int maxLength=0;
		Graph G=new Graph(edgelist.length);
		for(int i=0;i<edgelist.length;i+=2){
			G.addEdge(edgelist[i],edgelist[(i+1)]);
		}

		bfs(G,x);
		for(int element:distTo)
			if(element>maxLength) maxLength=element;
		
		
		return maxLength ;
		
	}
	public static int find_V(int a[]){
		int max=0;
		for(int element:a)
			if(element>max) max=element;
		return max;
			
	}

	
	private  void bfs(Graph G,int s){
		Queue<Integer> q= new LinkedList<Integer>();		
		q.offer(s);//enqueue
		marked[s]=true;
		distTo[s]=0;
		while (!q.isEmpty()) {
            int v = q.poll();//dequeue
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                	q.offer(w);
                	marked[w] = true;
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    
                }
            }
        }
		
	
	}
	public class Graph
	{
		private ArrayList<Integer>[] adj;
		
		@SuppressWarnings("unchecked")
		public Graph(int V){
			adj=(ArrayList<Integer>[])new ArrayList[V];
			for(int v=0;v<V;v++){
				adj[v]=new ArrayList<Integer>();
				}
		}
		public void addEdge(int v,int w)
		{
			adj[v].add(w);
			adj[w].add(v);
	    }
		public Iterable<Integer> adj(int v){
			return adj[v];
		}
		
		
		
	}

}
