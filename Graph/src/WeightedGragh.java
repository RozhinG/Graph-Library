import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class WeightedGragh<T> {
	
	private ArrayList<T> vertexList;
	private int NumOfVertex;
	private LinkedList<GenericEdge<T>> [] AdjacentList;
	//private HashMap<Vertex,LinkedList<Edge> > VertexMap;

	public WeightedGragh() {
		this.NumOfVertex=0;
		this.vertexList= (ArrayList<T>) new ArrayList<T>();	
		this.AdjacentList=new LinkedList[10];
	}
	public WeightedGragh(int size) {
		this.NumOfVertex=size;
		this.vertexList=(ArrayList<T>) new ArrayList<T>();
		this.AdjacentList=new LinkedList[10];
		for(int i=0;i<this.NumOfVertex;i++)
		this.AdjacentList[i]=new LinkedList<GenericEdge<T>>();
	//	this.VertexMap= new HashMap<Vertex, LinkedList<Edge>>();
	}

	public LinkedList<GenericEdge<T>>[] getAdjacentList() {
		return AdjacentList;
	}

	public void setAdjacentList(LinkedList<GenericEdge<T>>[] adjacentList) {
		AdjacentList = adjacentList;
	}
	
	
	public void addVertex(T token)
	{
		if(!this.vertexList.contains(token))///if v is not in the vertexlist
		{
			try {
				
			this.vertexList.add(token);
			this.NumOfVertex++;
			int i=this.vertexList.indexOf(token);
			this.AdjacentList[i]=new LinkedList<GenericEdge<T>>();
			}
			catch(Exception ex)
			{
				
			}
		}
		else 
			return;
		
	}
	public void addEdge(T token,T token2,int weight) {
		
		this.addVertex(token);///if from is not in the vertexlist
		
		this.addVertex(token2);///if to is not in the vertexlist
				
		GenericEdge<T> e=new GenericEdge(token, token2, weight);
		int indexFrom=this.vertexList.indexOf(token);
		this.AdjacentList[indexFrom].add( e); //adding the new edge to the end of list
		
	}
	
	public void getEdges(T vertex)
	{
		int index=this.vertexList.indexOf(vertex);
		 System.out.print("[");
         for(GenericEdge<T> e: this.AdjacentList[index]){ 
             System.out.print("("+e.getTo()+","+e.getCost()+") ,"); 
         } 
         System.out.print("]");
		
	}

	
	public void getVertices() 
	{
		if(this.NumOfVertex==0)
			System.out.print("This Graph doesn't have any vertex yet."+"\n");
		else {
			System.out.print("Vertices List"+"\n");
		for(int i=0;i<this.NumOfVertex;i++)
			System.out.println(this.vertexList.get(i));
			System.out.print("\n");
		}
		
	}
	public void printGraph() 
    {  
		if(this.NumOfVertex==0)
			System.out.print("Graph is empty"+"\n");
        for(int v = 0; v < this.NumOfVertex; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ this.vertexList.get(v)); 
            System.out.print("head"); 
            System.out.print("[");
            for(GenericEdge<T> e: this.AdjacentList[v]){ 
                System.out.print("("+e.getTo()+","+e.getCost()+") ,"); 
            } 
            System.out.print("]");
            System.out.println("\n"); 
        } 
    } 
}
