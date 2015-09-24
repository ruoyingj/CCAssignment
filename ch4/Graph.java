package ch4;

import java.util.ArrayList;
import java.util.List;


public class Graph {
	public static class GraphNode{
		//String content;
		boolean visited;
		List<GraphNode> adjacent;
		public GraphNode(){
			visited = false;
			adjacent = new ArrayList<GraphNode>();
			}
		
	}
	List<GraphNode> nodes;
	
	
	
}
