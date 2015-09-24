package ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Solution07 {
	public class Project{
		Vector<Project> nodes = new Vector<Project>();
		HashMap<String, Project> hashmap = new HashMap<String, Project>();
		String name;
		public void project(String name){
			this.name = name;
		}
		int countDependencies;
		public void addDep(Project dep){
			if(!hashmap.containsKey(dep.getName())){
				nodes.add(dep);
				countDependencies++;
			}
			
		}
		public String getName(){
			return name;
		}
		public int getCountDependencies(){
			return countDependencies;
		}
		public Vector<Project> getNodes(){
			return nodes;
		}
		
	}
	public class Graph{
		Vector<Project> nodes = new Vector<Project>();
		HashMap<String, Project> hashmap = new HashMap<String, Project>();
		public Project getNode(String name){
			if(!hashmap.containsKey(name)){
				Project n = new Project();
				nodes.add(n);
				hashmap.put(name, n);
			}
			return hashmap.get(name);
		}
		public void connect(String begin, String end){
			Project a = getNode(begin);
			Project b = getNode(end);
			a.addDep(b);
			
		}
	
		
	}
	Graph initializeGraph(String[] p, String[][] dependencies){
		Graph g = new Graph();
	for(String node: p){
		g.getNode(node);
	}
	for(String[] d:dependencies){
		String begin = d[0];
		String end = d[1];
		
	}
	return g;
	}
	int getIndex(Project order[], Vector<Project> node, int index){
		for(Project p: order){
			if(p.getCountDependencies() == 0){
				order[index] = p;
				index++;
			}
		}
		return index;
	}
	
	public Project[] getOrder (Vector<Project> p){
		Project[] result = new Project[p.size()];
		int index = 0;
		index = getIndex(result, p, index);
		int step = 0;
		while(step < p.size()){
			Project temp = result[step];
			Vector<Project> child = temp.getNodes();
			for(Project m:child){
				m.countDependencies--;
			}
			index = getIndex(result, child, index);
			step++;
			
		}
		return result;
		
	}
}
