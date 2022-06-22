import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	
	public static void ReadValues()
	{
		 String[] token=new String[6];
		try {
		System.out.print("Please enter the path for the file");
		Scanner sc=new Scanner(System.in);
		String path=sc.next();
		  File file = new File(path); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  st = br.readLine();
        if(st.equals("directed weighted"))
        {
        	WeightedGragh<String> WD=new WeightedGragh<String>();
        	
        	
		  while ((st = br.readLine()) != null) 
		  {
			 token=st.split("=");
			 int weight=Integer.parseInt(token[2]);	
			 String from=token[0];
			 String to=token[1];
			 WD.addEdge(from, to,weight);
		    System.out.println(token[0]); 
		    System.out.println(token[1]); 
		    System.out.println(token[2]); 
		  }
		   WD.printGraph();
			WD.getVertices();
			WD.getEdges("M");
        }
        else if(st.equals("undirected unweighted"))
        {
        	Undirectedunweighted<Integer> UU=new Undirectedunweighted<Integer>();
        	
        	
  		  while ((st = br.readLine()) != null) 
  		  {
  			 token=st.split("=");
  			 int from=Integer.parseInt(token[0]);
  			 int to=Integer.parseInt(token[1]);
  			UU.addEdge(from, to);
  		    System.out.println(token[0]); 
  		    System.out.println(token[1]); 
  		  }
  		   UU.printGraph();
  			UU.getVertices();
  			UU.getEdges(2);
        }
        	
		}
		catch(Exception ex) {
			ex.getMessage();
		}
	}

	public static void main(String[] args) {
	/*	
		WeightedGragh WD=new WeightedGragh();		
		WD.addEdge("A", "B", 3);		
		WD.addEdge( "B","A", 5);
		WD.addEdge( "B","A", 2);
		WD.addEdge( "B","C", 4);
		WD.addEdge( "B","D", 5);
		WD.printGraph();
	//	WD.printGraph();
		WD.getVertices();
		WD.getEdges("B");
		*/
		ReadValues();
	}

}
