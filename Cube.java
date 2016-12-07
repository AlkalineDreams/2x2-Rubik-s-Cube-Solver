public class Cube {

	//properties
	private Square[] _cube = new Square[24];
	private Cube[] _tried;
	
	//constructor
	public Cube(char[] inputArray){
		
		for (int counter = 0; counter < 24; counter++) {
			
			Square temp = new Square(inputArray[counter]);
			this._cube[counter] = temp;
			
		}
		
	}
	
	public boolean Solve(){
		
		boolean solved = false;
		
	}

}
