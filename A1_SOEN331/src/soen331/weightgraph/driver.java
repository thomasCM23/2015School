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
		Node<String> v9 = new Node<String>();
		Node<String> v10 = new Node<String>();
		Node<String> v11 = new Node<String>();
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
		g6.insertEdge(v3, v4, "This will be removed");
		System.out.println(gtemp.equals(g6.removeEdge(v3, v4)));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g7 = new NewGraph<String>();
		g7.insertEdge(v5, v6, "Are adjacent");
		System.out.println("Nodes are adjacent? "+ g7.areAdjacent(v5, v6));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g8 = new NewGraph<String>();
		g8.insertEdge(v7, v8, "mmmmmmmm");
		g8.insertEdge(v8, v9, "llllll");
		System.out.println(g8.incidentEdges(v8));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g9 = new NewGraph<String>();
		g9.insertEdge(v10, v11, "elem");
		for(int i=0; i<g9.edges().size();i++){
			if(g9.edges().get(i).getElem().equals("elem")){
					 e5 = g9.edges().get(i);
			}	
		}
		System.out.println(v10);
		System.out.println(v11);
		System.out.println("Opposit of "+ v10+" is "+g9.opposite(v10, e5));
		System.out.println("-------------------------------------------------");
		NewGraph<String> g10 = new NewGraph<String>();
		g10.insertEdge(v7, v8, "mmmmmmmm");
		for(int i=0; i<g10.edges().size();i++){
			if(g9.edges().get(i).getElem().equals("elem")){
					 e6 = g10.edges().get(i);
			}	
		}
		System.out.println(g10.endVertices(e6));
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		NewGraph<String> g11 = new NewGraph<String>();
		g11.insertEdge(v7, v8, "mmmmmmmm");
		for(int i=0; i<g11.edges().size();i++){
			if(g9.edges().get(i).getElem().equals("elem")){
					 e7 = g11.edges().get(i);
			}	
		}
		System.out.println(g11.getEdgeElem(e7));
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		NewGraph<String> g12 = new NewGraph<String>();
		g12.insertEdge(v7, v8, "mmmmmmmm");
		for(int i=0; i<g12.edges().size();i++){
			if(g9.edges().get(i).getElem().equals("elem")){
					 e8 = g12.edges().get(i);
			}	
		}
		g12.replaceEdgeElem(e8, "DDEDA");
		System.out.println(g12.getEdgeElem(e8));
		System.out.println("-------------------------------------------------");
		
	}

}
