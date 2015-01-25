package soen331.graphadt;

public class Node <T> {
	
	private Node<T>[] links;
	private int numberOfLinks;
	private T element;
	
	public Node(){
		this.links = new Node[10];
		this.numberOfLinks = 0;
		this.element = null;
	}
	
	//accessors
	
	public T getElem(){
		return this.element;
	}
	public Node[] getLinks(){
		return this.links;
	}
	public int getNumLinks(){
		return this.numberOfLinks;
	}
	
	//mutators
	
	public void setElem(T elem){
		this.element = elem;
	}
	public void setLink(Node<T> link){
		if(this.numberOfLinks == this.links.length -2){
			sizeDouble();
		}
		this.links[this.numberOfLinks] = link;
		this.numberOfLinks ++;
	}
	
	public void sizeDouble(){
		Node<T>[] doubleLink = new Node[this.links.length*2];
		for(int i=0; i<this.links.length;i++){
			doubleLink[i] = this.links[i];
		}
		this.links = doubleLink;
	}
}
