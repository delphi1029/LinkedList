package com.ds.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	List<GraphVertex> vertices;
	
	public Graph(List<GraphVertex> vertices) {
		super();
		this.vertices = vertices;
	}

	// Add an undirected edge between two nodes
		public void addUndirectedEdge(int i, int j) {
			GraphVertex first = vertices.get(i-1);
			GraphVertex second = vertices.get(j-1);
			first.addEdge(second);	//Neighbour of first is second. Store it.
			second.addEdge(first);
		}//end of method
		
		
		
		/*
		 * BFS algo - 
		 * start with a node and add it in a queue.
		 * loop till queue is not empty
		 * poll first element from the queue
		 * if node is marked not visited then print the node and mark it as visited
		 * otherwise do not print and move to next step
		 * then loop through the neighbours of the node and
		 * add those neighbour to the queue which are not visited.
		 */
		public void bfs() {
			
			for(GraphVertex v : vertices) {
				if(!v.isVisited) {
					Queue<GraphVertex> queue = new LinkedList<>();
					queue.add(v); //add source node to queue
					
					while(!queue.isEmpty()) {
						GraphVertex curr = queue.poll();
						
						if(!curr.isVisited) {
							System.out.print(curr.name+ " ");
							curr.isVisited = true;
						}
						
						//insert neighbor which are not visited
						for(GraphVertex g : curr.neighbours) {
							if(!g.isVisited) {
								queue.add(g);	
							}
						}
					}
				}
			}
		}

		
		
		
		public void dfs() {
			for(GraphVertex v : vertices) {
				if(!v.isVisited) {
					Stack<GraphVertex> stack = new Stack<>();
					stack.push(v);
					
					while(!stack.isEmpty()) {
						GraphVertex curr = stack.pop();
						
						if(!curr.isVisited) {
							System.out.print(curr.name+" ");
							curr.isVisited = true;
						}
						for(GraphVertex gv : curr.neighbours) {
							if(!gv.isVisited) 
								stack.push(gv);
						}
					}
				}
			}
		}
		

}
