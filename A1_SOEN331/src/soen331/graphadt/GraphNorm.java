package soen331.graphadt;

public class GraphNorm <T> {
	
	private Node[] vertices;
	//the edges???
	
	public GraphNorm(){
		this.vertices = null;
		//this.ars = null;
	}
	
	public GraphNorm createNewGraph(){
		return new GraphNorm();
	}
	public Node[] vertices(){
		return this.vertices;
	}
	//method edges
	
	public int countAllEdges(){
		int num = 0;
		for(int i=0; i<this.vertices.length; i++){
			num += vertices[i].getNumLinks();
		}
		return num;
	}
	public int countAllVertices(){
		return vertices.length;
	}
	//method getEdges
	
	public Node[] incedentEdges(Node vertex){
		return vertex.getLinks();
	}
	
	

}
