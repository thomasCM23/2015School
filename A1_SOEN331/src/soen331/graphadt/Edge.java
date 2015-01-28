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
	public HashMap<String,ArrayList<T>> getEdges(){
		ArrayList<T> nodeList = new ArrayList<T>();
		HashMap<String, ArrayList<T>> ret = new HashMap<String, ArrayList<T>>();
		nodeList.add(getHead().getElem());
		nodeList.add(getTail().getElem());
		ret.put(getID(),nodeList);
		return ret;
	}
	
	public String testNodes(Node<T> w, Node<T> v){
		if((this.head.equals(w) && this.tail.equals(v)) ||(this.head.equals(v) && this.tail.equals(w))){
			return this.id;
		}
		else return null;
	}
	
}
