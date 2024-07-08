import java.util.ArrayList;
public class AdjacencyList{
	public static void main(String args []){
		ArrayList<ArrayList> adjList = new ArrayList<>();
		char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		for(int i = 1; i <= 7; i++){
			adjList.add(new ArrayList<>());
		}
		
		adjList.get(0).add('B');
		adjList.get(1).add('A');
		adjList.get(1).add('C');
		adjList.get(2).add('B');
		adjList.get(2).add('D');
		adjList.get(2).add('E');
		adjList.get(3).add('C');
		adjList.get(3).add('E');
		adjList.get(3).add('F');
		adjList.get(3).add('G');
		adjList.get(4).add('C');
		adjList.get(4).add('D');
		adjList.get(4).add('F');
		adjList.get(5).add('D');
		adjList.get(5).add('E');
		adjList.get(6).add('D');
		
		for(int j = 0; j < 7; j++){
			System.out.println(vertices[j] + ": " + adjList.get(j));
		}			
	}
}