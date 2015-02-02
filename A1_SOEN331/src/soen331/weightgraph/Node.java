package soen331.weightgraph;

import java.util.ArrayList;

public class Node<T> {
	private ArrayList<Edge<T>> edges;
	public Node(){
		this.edges = new ArrayList<Edge<T>>();;
	}
	public ArrayList<Edge<T>>getEdgeList(){
		return this.edges;
	}
	public Edge<T> getEdge(Edge<T> elem){
		return this.edges.get(this.edges.indexOf(elem));
	}
	public void setEdgeList(ArrayList<Edge<T>> list){
		this.edges = list;
	}
	public void setEdge(Edge<T> edge){
		this.edges.add(edge);
	}
	public void removeEdge(Edge<T> elem){
		this.edges.remove(elem);
	}
}
