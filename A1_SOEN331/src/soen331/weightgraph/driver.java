package soen331.weightgraph;

import java.util.ArrayList;



public class driver {
	public static void main(String[] args){
		
		//nodes
		Node<String> v1 = new Node<String>();
		Node<String> v2 = new Node<String>();
		Node<String> v3 = new Node<String>();
		Node<String> v4 = new Node<String>();
		Node<String> v5 = new Node<String>();
		Node<String> v6 = new Node<String>();
		Node<String> v7 = new Node<String>();
		Node<String> v8 = new Node<String>();
		//edges
		Edge<String> e1 = new Edge<String>();
		Edge<String> e2 = new Edge<String>();
		Edge<String> e3 = new Edge<String>();
		Edge<String> e4 = new Edge<String>();
		Edge<String> e5 = new Edge<String>();
		Edge<String> e6 = new Edge<String>();
		Edge<String> e7 = new Edge<String>();
		Edge<String> e8 = new Edge<String>();
		Edge<String> e9 = new Edge<String>();
		Edge<String> e10 = new Edge<String>();
		
		//the graph
		NewGraph<String> g1 = new NewGraph<String>();
		System.out.println("-------------------------------------------------");
		System.out.println("verticies: "+ g1.vertices()+" Number of: "+g1.countAllVertices());
		System.out.println("Edges: "+ g1.edges()+" Number of: "+g1.countAllEdges());
		System.out.println("-------------------------------------------------");
		NewGraph<String> g2 = new NewGraph<String>();
		g2.insertVertex(v1);
		g2.insertVertex(v2);
		System.out.println("Vertices: "+ g2.vertices()+" Number of: "+g2.countAllVertices());
		System.out.println("-------------------------------------------------");
		NewGraph<String> g3 = new NewGraph<String>();
		g3.insertVertex(v1);
		g3.insertVertex(v1);
		System.out.println("Vertices: "+ g3.vertices()+" Number of: "+g3.countAllVertices());
		System.out.println("-------------------------------------------------");
		NewGraph<String> g4 = new NewGraph<String>();
		NewGraph<String> g5 = g4;
		g4 = g4.insertVertex(v1);
		System.out.println(g5.equals(g4.removeVertex(v1)));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g6 = new NewGraph<String>();
		NewGraph<String> gtemp = g6;
		g6.insertEdge(v5, v6, "This will be removed");
		System.out.println(gtemp.equals(g6.removeEdge(v5, v6)));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g7 = new NewGraph<String>();
		System.out.println("-------------------------------------------------");
		
		System.out.println("-------------------------------------------------");
	}

}
