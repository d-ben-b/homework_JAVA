import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
		ArrayList<String> fileContent = FileIO.readfile("event.txt");
		for(int i=0; i<fileContent.size(); i++){
			System.out.println(fileContent.get(i));
		}
	}
}