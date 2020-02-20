package com.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphMain {
	
	public static void main(String[] args) {
		
		//Initialize a Arraylist for storing all the graph nodes
		List<GraphVertex> nodeList = new ArrayList<>();
				
		//create 10 nodes: v1-v10
		for(int i=1;i<11; i++) {
			nodeList.add(new GraphVertex("V"+i, i));
		}
		
		
		Graph graph = new Graph(nodeList);
		
		//add edges 
		graph.addUndirectedEdge(1,2);
		graph.addUndirectedEdge(1,4);
		graph.addUndirectedEdge(2,3);
		graph.addUndirectedEdge(2,5);
		graph.addUndirectedEdge(3,6);
		graph.addUndirectedEdge(3,10);
		graph.addUndirectedEdge(4,7);
		graph.addUndirectedEdge(5,8);
		graph.addUndirectedEdge(6,9);
		graph.addUndirectedEdge(7,8);
		graph.addUndirectedEdge(8,9);
		graph.addUndirectedEdge(9,10);
		
		System.out.println("************************BFS*************");
		
	//	graph.bfs();
		
		System.out.println();
		System.out.println("************************DFS*************");
		System.out.println();
		
		graph.dfs();
	}

}
