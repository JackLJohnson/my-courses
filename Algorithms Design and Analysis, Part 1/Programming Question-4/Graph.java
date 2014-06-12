import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;
	
	public Graph() {
		vertices = new ArrayList<Vertex>();
	}
	
	public void addVertex(int data) {
		Vertex vertex = new Vertex(data);
		vertices.add(vertex);
	}
	
	public void addEdges(int index, ArrayList<Integer> edges) {
		vertices.get(index).addEdges(edges);
	}
	
	public ArrayList<Vertex> getVertexs() {
		return vertices;
	}
	
	public void print() {
		for(Vertex vertex : vertices) {
			System.out.print(vertex.getData() + "\t");
			Edge edge = vertex.getFirstArc();
			while(edge != null) {
				System.out.print(edge.getToVertex() + "\t");
				edge = edge.getNextArc();
			}
			System.out.println();
		}
	}
}