package soen331.graphadt;

public class Node <T> {
	
	private Node<T> node;
	private T element;
	
	public Node(){
		this.node = new Node();
		this.element = null;
	}
	
	//accessors
	
	public T getElem(){
		return this.element;
	}
	public Node<T> getLinks(){
		return this.node;
	}
	
	//mutators
	
	public void setElem(T elem){
		this.element = elem;
	}
	public void setLink(Node<T> link){
		this.node = link;
	}
}
