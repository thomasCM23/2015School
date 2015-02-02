package soen331.weightgraph;

public class Edge<T> {
	
	private Node<T> head, tail;
	private T elem;
	
	public Edge(){
		this.head = null;
		this.tail = null;
		this.elem = null;
	}
	public Edge(Node<T> head, Node<T> tail, T elem){
		this.elem = elem;
		this.head = head;
		this.tail = tail;
	}
	public Edge(T elem){
		this.elem = elem;
	}
	
	public Node<T> getHead(){
		return this.head;
	}
	public Node<T> getTail(){
		return this.tail;
	}
	public T getElem(){
		return this.elem;
	}
	public void setHead(Node<T> head){
		this.head = head;
	}
	public void setTail(Node<T> tail){
		this.tail = tail;
	}
	public void setElem(T elem){
		this.elem = elem;
	}
	public Edge<T> getEdge(Node<T> head, Node<T> tail){
		if(this.head.equals(head) && this.tail.equals(tail)){
			return this;
		}
		else if(this.head == tail && this.tail == head){
			return this;
		}
		else return null;
	}
	public Node<T> getOpposite(Node<T> headOrTail, T elem){
		if(this.head.equals(headOrTail)&& this.elem.equals(elem))
			return this.tail;
		if(this.tail.equals(headOrTail)&& this.elem.equals(elem))
			return this.head;
		return null;
	}

}
