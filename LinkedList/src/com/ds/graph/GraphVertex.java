package com.ds.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphVertex {
	
	String name;
	
	int index;
	
	List<GraphVertex> neighbours;
	
	boolean isVisited;

	
	public GraphVertex(String name, int index) {
		super();
		this.name = name;
		this.index = index;
		neighbours = new LinkedList<>();
	}


	public void addEdge(GraphVertex v) {
		neighbours.add(v);
	}

}
