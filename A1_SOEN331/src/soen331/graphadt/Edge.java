package soen331.graphadt;

import java.util.ArrayList;
import java.util.HashMap;

public class Edge<T> {

	private Node<T> head, tail;
	private String id;
	
	public Edge(){
		this.head = null;
		this.tail = null;
		this.id = null;
	}
	public Edge(Node<T> v, Node<T>w, String id){
		this.head.setLink(v.getLinks());
		this.tail.setLink(w.getLinks());;
		this.id = id;
	}
	
	public void set(Node<T> v, Node<T> w, String id){
		this.head.setLink(v.getLinks());
		this.tail.setLink(w.getLinks());;
		this.id = id;
	}
	private Node<T> getHead(){
		return this.head;
	}
	private Node<T> getTail(){
		return this.tail;
	}
	public String getID(){
		return this.id;
	}
	public HashMap<String, ArrayList<Node<T>>> getEdges(){
		ArrayList<Node<T>> nodeArray = new ArrayList<Node<T>>();
		HashMap<String, ArrayList<Node<T>>> ret = new HashMap<String, ArrayList<Node<T>>>();
		nodeArray.add(getHead());
		nodeArray.add(getTail());
		ret.put(getID(),nodeArray);
		return ret;
	}
	
	public String testNodes(Node<T> w, Node<T> v){
		if((this.head.equals(w) && this.tail.equals(v)) ||(this.head.equals(v) && this.tail.equals(w))){
			return this.id;
		}
		else return null;
	}
	
}
