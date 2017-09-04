import java.util.*;
public class Last{
	public static void main(String[] args){
		String nodes[] = new String[100];
		boolean adjMatrix[][] = new boolean[100][100];
		for (int i = 0; i < 100; i++) {
			nodes[i] = "Node " + i;
		}
	 adjMatrix[1][2] = true;
   	 adjMatrix[1][12] = true;
   	 adjMatrix[1][0] = true; 
   	 adjMatrix[2][3] = true;
   	 adjMatrix[2][4] = true;
   	 adjMatrix[2][1] = true; 
   	 adjMatrix[3][13] = true;
   	 adjMatrix[4][5] = true;
   	 adjMatrix[5][7] = true;
   	 adjMatrix[5][11] = true;
   	 adjMatrix[7][6] = true;
   	 adjMatrix[8][18] = true;
   	 adjMatrix[8][9] = true;
   	 adjMatrix[9][10] = true;
   	 adjMatrix[9][16] = true;
   	 adjMatrix[9][17] = true;
   	 adjMatrix[11][10] = true;
   	 adjMatrix[12][8] = true;
   	 adjMatrix[12][20] = true;
   	 adjMatrix[12][1] = true;
   	 adjMatrix[13][5] = true;
   	 adjMatrix[14][3] = true;
   	 adjMatrix[14][13] = true;
   	 adjMatrix[14][95] = true;
   	 adjMatrix[14][99] = true; 
   	 adjMatrix[15][1] = true;
   	 adjMatrix[15][14] = true;
   	 adjMatrix[16][27] = true;
   	 adjMatrix[17][22] = true;
   	 adjMatrix[17][25] = true;
   	 adjMatrix[19][15] = true;
   	 adjMatrix[19][12] = true;
   	 adjMatrix[20][19] = true;
   	 adjMatrix[20][21] = true;
   	 adjMatrix[21][22] = true;
   	 adjMatrix[25][24] = true;
   	 adjMatrix[25][23] = true;
   	 adjMatrix[26][16] = true;
   	 adjMatrix[27][26] = true;
   	 adjMatrix[27][28] = true;
   	 adjMatrix[28][29] = true;
   	 adjMatrix[28][34] = true;
   	 adjMatrix[29][32] = true;
   	 adjMatrix[30][37] = true;
   	 adjMatrix[31][30] = true;
   	 adjMatrix[31][33] = true;
   	 adjMatrix[32][36] = true;
   	 adjMatrix[33][38] = true;
   	 adjMatrix[34][29] = true;
   	 adjMatrix[35][41] = true;
   	 adjMatrix[35][51] = true;
   	 adjMatrix[36][35] = true;
   	 adjMatrix[38][39] = true;
   	 adjMatrix[39][33] = true;
   	 adjMatrix[39][31] = true;
   	 adjMatrix[40][39] = true;
   	 adjMatrix[41][52] = true;
   	 adjMatrix[42][43] = true;
   	 adjMatrix[43][40] = true;
   	 adjMatrix[44][43] = true;
   	 adjMatrix[44][52] = true;
   	 adjMatrix[45][51] = true;
   	 adjMatrix[46][50] = true;
   	 adjMatrix[46][51] = true;
   	 adjMatrix[47][48] = true;
   	 adjMatrix[48][47] = true;
   	 adjMatrix[48][87] = true;
   	 adjMatrix[48][49] = true;
   	 adjMatrix[49][47] = true;
   	 adjMatrix[50][47] = true;
   	 adjMatrix[51][53] = true;
   	 adjMatrix[51][35] = true;
   	 adjMatrix[51][54] = true;
   	 adjMatrix[52][41] = true;
   	 adjMatrix[52][44] = true;
   	 adjMatrix[52][45] = true;
   	 adjMatrix[53][46] = true;
   	 adjMatrix[54][53] = true;
   	 adjMatrix[54][55] = true;
   	 adjMatrix[55][56] = true;
   	 adjMatrix[56][57] = true;
   	 adjMatrix[56][58] = true;
   	 adjMatrix[57][58] = true;
   	 adjMatrix[58][56] = true;
   	 adjMatrix[58][60] = true;
   	 adjMatrix[59][58] = true;
   	 adjMatrix[60][70] = true;
   	 adjMatrix[60][61] = true;
   	 adjMatrix[61][62] = true;
   	 adjMatrix[62][63] = true;
   	 adjMatrix[63][64] = true;
   	 adjMatrix[64][66] = true;
   	 adjMatrix[66][65] = true;
   	 adjMatrix[65][69] = true;
   	 adjMatrix[69][68] = true;
   	 adjMatrix[68][67] = true;
   	 adjMatrix[67][65] = true;
   	 adjMatrix[70][59] = true;
   	 adjMatrix[71][73] = true;
   	 adjMatrix[71][74] = true;
   	 adjMatrix[72][74] = true;
   	 adjMatrix[72][75] = true;
   	 adjMatrix[73][72] = true;
   	 adjMatrix[73][74] = true;
   	 adjMatrix[75][55] = true;
   	 adjMatrix[75][76] = true;
   	 adjMatrix[75][79] = true;
   	 adjMatrix[76][72] = true;
   	 adjMatrix[77][80] = true;
   	 adjMatrix[77][78] = true;
   	 adjMatrix[78][75] = true;
   	 adjMatrix[78][76] = true;
   	 adjMatrix[78][83] = true;
   	 adjMatrix[79][77] = true;
   	 adjMatrix[80][48] = true;
   	 adjMatrix[82][83] = true;
   	 adjMatrix[83][77] = true;
   	 adjMatrix[83][84] = true;
   	 adjMatrix[84][83] = true;
   	 adjMatrix[84][97] = true;
   	 adjMatrix[85][81] = true;
   	 adjMatrix[85][82] = true;
   	 adjMatrix[86][98] = true;
   	 adjMatrix[87][80] = true;
   	 adjMatrix[87][86] = true;
   	 adjMatrix[88][87] = true;
   	 adjMatrix[88][89] = true;
   	 adjMatrix[89][86] = true;
   	 adjMatrix[90][13] = true;
   	 adjMatrix[91][89] = true;
   	 adjMatrix[91][93] = true;
   	 adjMatrix[92][98] = true;
   	 adjMatrix[93][90] = true;
   	 adjMatrix[93][95] = true;
   	 adjMatrix[93][94] = true;
   	 adjMatrix[94][92] = true;
   	 adjMatrix[94][96] = true;
   	 adjMatrix[96][92] = true;
   	 adjMatrix[97][84] = true;
   	 adjMatrix[97][96] = true;
   	 adjMatrix[97][92] = true;
   	 adjMatrix[98][85] = true;
   	 adjMatrix[98][89] = true;
   	 adjMatrix[99][95] = true;

		ElementaryCyclesSearch ecs = new ElementaryCyclesSearch(adjMatrix, nodes);
		List cycles = ecs.getElementaryCycles();
		for (int i = 0; i < cycles.size(); i++) {
			List cycle = (List) cycles.get(i);
			for (int j = 0; j < cycle.size(); j++) {
				String node = (String) cycle.get(j);
				if (j < cycle.size() - 1) {
					System.out.print(node + " -> ");
				} else {
					System.out.print(node);
				}
			}
			System.out.print("\n");
		}
	}
}
class AdjacencyList {
	public static int[][] getAdjacencyList(boolean[][] adjacencyMatrix) {
		int[][] list = new int[adjacencyMatrix.length][];

		for (int i = 0; i < adjacencyMatrix.length; i++) {
			Vector v = new Vector();
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				if (adjacencyMatrix[i][j]) {
					v.add(new Integer(j));
				}
			}

			list[i] = new int[v.size()];
			for (int j = 0; j < v.size(); j++) {
				Integer in = (Integer) v.get(j);
				list[i][j] = in.intValue();
			}
		}
		
		return list;
	}
}
class ElementaryCyclesSearch {
	private List cycles = null;
	private int[][] adjList = null;
	private Object[] graphNodes = null;
	private boolean[] blocked = null;
	private Vector[] B = null;
	private Vector stack = null;
	public ElementaryCyclesSearch(boolean[][] matrix, Object[] graphNodes) {
		this.graphNodes = graphNodes;
		this.adjList = AdjacencyList.getAdjacencyList(matrix);
	}
	public List getElementaryCycles() {
		this.cycles = new Vector();
		this.blocked = new boolean[this.adjList.length];
		this.B = new Vector[this.adjList.length];
		this.stack = new Vector();
		StrongConnectedComponents sccs = new StrongConnectedComponents(this.adjList);
		int s = 0;
		while (true) {
			SCCResult sccResult = sccs.getAdjacencyList(s);
			if (sccResult != null && sccResult.getAdjList() != null) {
				Vector[] scc = sccResult.getAdjList();
				s = sccResult.getLowestNodeId();
				for (int j = 0; j < scc.length; j++) {
					if ((scc[j] != null) && (scc[j].size() > 0)) {
						this.blocked[j] = false;
						this.B[j] = new Vector();
					}
				}

				this.findCycles(s, s, scc);
				s++;
			} else {
				break;
			}
		}

		return this.cycles;
	}
	private boolean findCycles(int v, int s, Vector[] adjList) {
		boolean f = false;
		this.stack.add(new Integer(v));
		this.blocked[v] = true;

		for (int i = 0; i < adjList[v].size(); i++) {
			int w = ((Integer) adjList[v].get(i)).intValue();
			if (w == s) {
				Vector cycle = new Vector();
				for (int j = 0; j < this.stack.size(); j++) {
					int index = ((Integer) this.stack.get(j)).intValue();
					cycle.add(this.graphNodes[index]);
				}
				this.cycles.add(cycle);
				f = true;
			} else if (!this.blocked[w]) {
				if (this.findCycles(w, s, adjList)) {
					f = true;
				}
			}
		}

		if (f) {
			this.unblock(v);
		} else {
			for (int i = 0; i < adjList[v].size(); i++) {
				int w = ((Integer) adjList[v].get(i)).intValue();
				if (!this.B[w].contains(new Integer(v))) {
					this.B[w].add(new Integer(v));
				}
			}
		}

		this.stack.remove(new Integer(v));
		return f;
	}
	private void unblock(int node) {
		this.blocked[node] = false;
		Vector Bnode = this.B[node];
		while (Bnode.size() > 0) {
			Integer w = (Integer) Bnode.get(0);
			Bnode.remove(0);
			if (this.blocked[w.intValue()]) {
				this.unblock(w.intValue());
			}
		}
	}
}
class SCCResult {
	private Set nodeIDsOfSCC = null;
	private Vector[] adjList = null;
	private int lowestNodeId = -1;
	
	public SCCResult(Vector[] adjList, int lowestNodeId) {
		this.adjList = adjList;
		this.lowestNodeId = lowestNodeId;
		this.nodeIDsOfSCC = new HashSet();
		if (this.adjList != null) {
			for (int i = this.lowestNodeId; i < this.adjList.length; i++) {
				if (this.adjList[i].size() > 0) {
					this.nodeIDsOfSCC.add(new Integer(i));
				}
			}
		}
	}

	public Vector[] getAdjList() {
		return adjList;
	}
	public int getLowestNodeId() {
		return lowestNodeId;
	}
}
class StrongConnectedComponents {
	private int[][] adjListOriginal = null;
	private int[][] adjList = null;
	private boolean[] visited = null;
	private Vector stack = null;
	private int[] lowlink = null;
	private int[] number = null;
	private int sccCounter = 0;
	private Vector currentSCCs = null;
	public StrongConnectedComponents(int[][] adjList) {
		this.adjListOriginal = adjList;
	}
	public SCCResult getAdjacencyList(int node) {
		this.visited = new boolean[this.adjListOriginal.length];
		this.lowlink = new int[this.adjListOriginal.length];
		this.number = new int[this.adjListOriginal.length];
		this.visited = new boolean[this.adjListOriginal.length];
		this.stack = new Vector();
		this.currentSCCs = new Vector();

		this.makeAdjListSubgraph(node);

		for (int i = node; i < this.adjListOriginal.length; i++) {
			if (!this.visited[i]) {
				this.getStrongConnectedComponents(i);
				Vector nodes = this.getLowestIdComponent();
				if (nodes != null && !nodes.contains(new Integer(node)) && !nodes.contains(new Integer(node + 1))) {
					return this.getAdjacencyList(node + 1);
				} else {
					Vector[] adjacencyList = this.getAdjList(nodes);
					if (adjacencyList != null) {
						for (int j = 0; j < this.adjListOriginal.length; j++) {
							if (adjacencyList[j].size() > 0) {
								return new SCCResult(adjacencyList, j);
							}
						}
					}
				}
			}
		}

		return null;
	}
	private void makeAdjListSubgraph(int node) {
		this.adjList = new int[this.adjListOriginal.length][0];

		for (int i = node; i < this.adjList.length; i++) {
			Vector successors = new Vector();
			for (int j = 0; j < this.adjListOriginal[i].length; j++) {
				if (this.adjListOriginal[i][j] >= node) {
					successors.add(new Integer(this.adjListOriginal[i][j]));
				}
			}
			if (successors.size() > 0) {
				this.adjList[i] = new int[successors.size()];
				for (int j = 0; j < successors.size(); j++) {
					Integer succ = (Integer) successors.get(j);
					this.adjList[i][j] = succ.intValue();
				}
			}
		}
	}
	private Vector getLowestIdComponent() {
		int min = this.adjList.length;
		Vector currScc = null;

		for (int i = 0; i < this.currentSCCs.size(); i++) {
			Vector scc = (Vector) this.currentSCCs.get(i);
			for (int j = 0; j < scc.size(); j++) {
				Integer node = (Integer) scc.get(j);
				if (node.intValue() < min) {
					currScc = scc;
					min = node.intValue();
				}
			}
		}

		return currScc;
	}
	private Vector[] getAdjList(Vector nodes) {
		Vector[] lowestIdAdjacencyList = null;

		if (nodes != null) {
			lowestIdAdjacencyList = new Vector[this.adjList.length];
			for (int i = 0; i < lowestIdAdjacencyList.length; i++) {
				lowestIdAdjacencyList[i] = new Vector();
			}
			for (int i = 0; i < nodes.size(); i++) {
				int node = ((Integer) nodes.get(i)).intValue();
				for (int j = 0; j < this.adjList[node].length; j++) {
					int succ = this.adjList[node][j];
					if (nodes.contains(new Integer(succ))) {
						lowestIdAdjacencyList[node].add(new Integer(succ));
					}
				}
			}
		}

		return lowestIdAdjacencyList;
	}
	private void getStrongConnectedComponents(int root) {
		this.sccCounter++;
		this.lowlink[root] = this.sccCounter;
		this.number[root] = this.sccCounter;
		this.visited[root] = true;
		this.stack.add(new Integer(root));

		for (int i = 0; i < this.adjList[root].length; i++) {
			int w = this.adjList[root][i];
			if (!this.visited[w]) {
				this.getStrongConnectedComponents(w);
				this.lowlink[root] = Math.min(lowlink[root], lowlink[w]);
			} else if (this.number[w] < this.number[root]) {
				if (this.stack.contains(new Integer(w))) {
					lowlink[root] = Math.min(this.lowlink[root], this.number[w]);
				}
			}
		}

		// found scc
		if ((lowlink[root] == number[root]) && (stack.size() > 0)) {
			int next = -1;
			Vector scc = new Vector();

			do {
				next = ((Integer) this.stack.get(stack.size() - 1)).intValue();
				this.stack.remove(stack.size() - 1);
				scc.add(new Integer(next));
			} while (this.number[next] > this.number[root]);

			// simple scc's with just one node will not be added
			if (scc.size() > 1) {
				this.currentSCCs.add(scc);
			}
		}
	}

	
}