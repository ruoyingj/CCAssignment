package ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ch4.Graph.GraphNode;

public class Solution01 {

	public static boolean bfsSearch(Graph g, GraphNode node1, GraphNode node2) {
		GraphNode start = node1;
		Queue<GraphNode> nodeQueue = new LinkedList<GraphNode>();
		nodeQueue.add(start);
		for (GraphNode n : g.nodes) {
			n.visited = false;
		}
		while (nodeQueue != null) {
			GraphNode current = nodeQueue.poll();
			if (g != null) {
				for (GraphNode a : current.adjacent) {
					if (!a.visited) {
						if (a == node2) {
							return true;
						} else {
							a.visited = true;
							nodeQueue.add(a);
						}
						
					}
				}

			}
		}
		return false;

	}

}
