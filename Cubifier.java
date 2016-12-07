import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cubifier {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		String cubeFile = "rubikstest.txt"; //CHANGE THIS FILE TO CHANGE WHICH CUBE YOU'RE SOLVING
		
		BufferedReader br = null;
		
		fr = new FileReader(cubeFile);
		br = new BufferedReader(fr);
		
		String line = br.readLine();
		br.close();
		
		char[] inputArray = line.toCharArray();
		
		Cube cube = new Cube(inputArray);
		
		if (cube.Solve()){
			
			//if solution was found
			System.out.println("A solution was found! Your cube's solution path is above.");
			System.out.println("The solution path is printed with the next move above the last as you scroll up, with the solved cube at the top.");
			
		} else {
			
			//if no solution was found
			System.out.println("Sorry, but we couldn't solve your cube.");
			System.out.println("This was most likely an error on our end. Please send us a message about it!");
			
		}

	}

}
