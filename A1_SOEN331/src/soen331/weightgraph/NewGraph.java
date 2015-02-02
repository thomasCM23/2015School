package soen331.weightgraph;

import java.util.ArrayList;
import java.util.Set;

public class NewGraph<T> {
	
	private ArrayList<Node<T>> vertecies;
	private ArrayList<Edge<T>> edges;
	
	public NewGraph(){
		this.vertecies = new ArrayList<Node<T>>();
		this.edges = new ArrayList<Edge<T>>();
	}
	//return the vertices as pointers
	public ArrayList<Node<T>> vertices(){
		return this.vertecies;
	}
	//return the edges elem
	public Set<Edge<T>> edges(){
		Set<Edge<T>> ret = null;
		for(int i=0; i<this.edges.size(); i++){
			ret.add(this.edges.get(i));
		}
		return ret;
	}
	public int countAllVertices(){
		return this.vertecies.size();
	}
	public int countAllEdges(){
		return this.edges.size();
	}
	//returns the element on the edge between the two vertices
	public Edge<T> getEdge(Node<T> head, Node<T> tail){
		Edge<T> ret = null;
		for(int i=0; i<this.edges.size(); i++){
			Edge<T> temp = this.edges.get(i).getEdge(head, tail);
			if( ! temp.equals(null)){
				ret = temp;
				return ret;
			}
		}
		return ret;
	}
	//return a set of all the incident edges elements at the node 
	@SuppressWarnings("null")
	public Set<T> incidentEdges(Node<T> v){
		Set<T> ret = null;
		ArrayList<Edge<T>> temp = v.getEdgeList();
		for(int i=0; i<temp.size(); i++){
			ret.add(temp.get(i).getElem());
		}
		return ret;
	}
	//return the opposite node 
	public Node<T> opposite(Node<T> v, Edge<T> e){
		Node<T> ret = null;
		ret = e.getOpposite(v, e.getElem());
		return ret;
	}
	//return the ends of the edge
	public Set<Node<T>> endVertices(Edge<T> e){
		Set<Node<T>> ret = null;
		ret.add(e.getHead());
		ret.add(e.getTail());
		return ret;
	}
	public boolean areAdjacent(Node<T> v, Node<T> w){
		ArrayList<Edge<T>> vEdges = v.getEdgeList();
		ArrayList<Edge<T>> wEdges = w.getEdgeList();
		for(int i=0; i<vEdges.size();i++){
			for(int j=0; i<wEdges.size();i++){
				if(vEdges.get(i).equals(wEdges.get(j))){
					return true;
				}
			}
		}
		return false;
	}
	public NewGraph<T> insertVertex(Node<T> v){
		this.vertecies.add(v);
		return this;
	}
	public NewGraph<T> removeVertex(Node<T> v){
		ArrayList<Edge<T>> temp = v.getEdgeList();
		for(int i=0; i<temp.size();i++){
			temp.get(i).setElem(null);
			temp.get(i).setHead(null);
			temp.get(i).setTail(null);
		}
		v.setEdgeList(null);
		this.vertecies.remove(v);
		return this;
	}
	public NewGraph<T> insertEdge(Node<T> v, Node<T> w, T elem){
		Edge<T> newEdge = new Edge<T>();
		newEdge.setElem(elem);
		newEdge.setHead(v);
		newEdge.setTail(w);
		if(!this.vertecies.contains(v))
			this.vertecies.add(v);
		if(!this.vertecies.contains(w))
			this.vertecies.add(w);
		v.setEdge(newEdge);
		w.setEdge(newEdge);
		this.edges.add(newEdge);
		return this;
	}
	public NewGraph<T> removeEdge(Node<T> v, Node<T> w){
		if(areAdjacent(v, w)){
			Edge<T> temp = getEdge(v, w);
			v.removeEdge(temp);
			w.removeEdge(temp);
			temp.setElem(null);
			temp.setHead(null);
			temp.setTail(null);
			this.edges.remove(temp);
		}
		return this;
	}
	public T getEdgeElem(Edge<T> edge){
		return edge.getElem();
	}
	public NewGraph<T> replaceEdgeElem(Edge<T> edge, T elem){
		edge.setElem(elem);
		return this;
	}
	
	


}
