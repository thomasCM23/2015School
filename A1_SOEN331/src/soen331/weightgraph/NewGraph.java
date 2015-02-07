package soen331.weightgraph;

import java.util.ArrayList;
import java.util.Set;

public class NewGraph<T> {
	
	private ArrayList<Node<T>> vertecies;
	private ArrayList<Edge<T>> edges;
	
	public NewGraph(){
		this.vertecies = new ArrayList<Node<T>>(10);
		this.edges = new ArrayList<Edge<T>>(10);
	}
	//return the vertices as pointers
	public ArrayList<Node<T>> vertices(){
		return this.vertecies;
	}
	//return the edges elem
	public ArrayList<Edge<T>> edges(){
		return this.edges;
	}
	public int countAllVertices(){
		return this.vertecies.size();
	}
	public int countAllEdges(){
		return this.edges.size();
	}
	//returns the element on the edge between the two vertices
	public Edge<T> getEdge(Node<T> head, Node<T> tail){
		for(int i=0; i<head.getEdgeList().size();i++){
			for(int j=0; i<tail.getEdgeList().size();j++){
				if(head.getEdgeList().get(i).equals(tail.getEdgeList().get(j))){
					return tail.getEdgeList().get(j);
				}
			}
		}
		return null;
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
		for(int i=0; i<v.getEdgeList().size();i++){
			for(int j=0; j<w.getEdgeList().size(); j++){
				if(v.getEdgeList().get(i).equals(w.getEdgeList().get(j))){
					return true;
				}
			}
		}
		return false;
	}
	public NewGraph<T> insertVertex(Node<T> v){
		if(!this.vertecies.contains(v))
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
		v.setEdge(newEdge);
		w.setEdge(newEdge);
		newEdge.setElem(elem);
		newEdge.setHead(v);
		newEdge.setTail(w);
		this.edges.add(newEdge);
		return this;
	}
	public NewGraph<T> removeEdge(Node<T> v, Node<T> w){
		if(areAdjacent(v, w)){
			Edge<T> temp = getEdge(v, w);
			temp.setHead(null);
			temp.setTail(null);
			temp.setElem(null);
			v.getEdgeList().remove(temp);
			w.getEdgeList().remove(temp);
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
