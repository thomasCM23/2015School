package soen331.graphadt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GraphNorm <T> {
	
	private Node<T>[] vertices;
	private Edge<T>[] edges;
	private int size;
	
	public GraphNorm(){
		this.vertices = null;
		this.edges = null;
		this.size = 0;
	}
	
	public Set<T> vertecies(){
		Set<T> ret = null;
		for(int i=0; i<this.vertices.length; i++){
			ret.add(this.vertices[i].getElem());
		}
		return ret;
	}
	public Set<HashMap<String, ArrayList<Node<T>>>> edges(){
		Set<HashMap<String, ArrayList<Node<T>>>> ret = null;
		for(int i=0; i<this.edges.length; i++){
			ret.add(this.edges[i].getEdges());
		}
		return ret;
	}
	public int countAllEdges(){
		return (this.edges.length-1);
	}
	public int countAllVertices(){
		return (this.vertices.length-1);
	}
	public String getEdge(Node<T>v, Node<T>w){
		String ret = "";
		for(int i=0; i<this.edges.length; i++){
			String edgeID = this.edges[i].testNodes(w, v);
			if(!edgeID.equals(null)){
				ret = edgeID;
			}
		}
		return ret;
	}
	
	

}
