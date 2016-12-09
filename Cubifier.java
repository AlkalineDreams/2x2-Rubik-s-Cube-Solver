import java.util.ArrayList;
import java.util.List;

public class Cube {

	//properties
	private Square[] _cube = new Square[24];
	private List<Cube> _tried = new ArrayList<Cube>();
	
	//constructor
	public Cube(char[] inputArray){
		
		for (int counter = 0; counter < 24; counter++) {
			
			Square temp = new Square(inputArray[counter]);
			this._cube[counter] = temp;
			
		}
		
	}
	
	
	public boolean Solve(){
		
		boolean solved = false;
		boolean beenHereBefore = false;
		
		for (int counter = 0; counter > this._tried.size(); counter++){
			
			if (this == this._tried.get(counter)){
				
				//if this cube layout has been seen before, do nothing.
				return false;
				
			} else {
				
				this._tried.add(this);
				
			}
			
		}
		
		//WORK CONTINUES HERE NEXT
		//CHECK IF THE CUBE IS ALREADY SOLVED, THEN USE RECURSION TO TRY EVERY COMBINATION OF THE 3 MOVES IF IT ISNT SOLVED
		
	}
	
	public boolean CubeSolved() {
		
		//checks if the cube is solved
		boolean solved = false;
		
		if(this._cube[0] == this._cube[1] && this._cube[0] == this._cube[2] && this._cube[0] == this._cube[3]){
			if(this._cube[4] == this._cube[5] && this._cube[4] == this._cube[6] && this._cube[4] == this._cube[7]){
				if(this._cube[8] == this._cube[9] && this._cube[8] == this._cube[10] && this._cube[8] == this._cube[11]){
					if(this._cube[12] == this._cube[13] && this._cube[12] == this._cube[14] && this._cube[12] == this._cube[15]){
						if(this._cube[16] == this._cube[17] && this._cube[16] == this._cube[18] && this._cube[16] == this._cube[19]){
							if(this._cube[20] == this._cube[21] && this._cube[20] == this._cube[22] && this._cube[20] == this._cube[23]){
								//if cube is solved
								solved = true;
							}
						}
					}
				}
			}
		}
		
		return solved;
		
	}
	
	public void moveF(){
		
		Square temp;
		Square temp2;
		Square temp3;
		Square temp4;
		
		//front face
		temp = this._cube[1];
		this._cube[1] = this._cube[0]; //moves 0 to 1
		temp2 = this._cube[3];
		this._cube[3] = temp;  //moves 1 to 3
		temp = this._cube[2];
		this._cube[2] = temp2; //moves 3 to 2
		this._cube[0] = temp;  //moves 2 to 0
		
		//left to top
		temp = this._cube[18];
		temp2 = this._cube[19];
		this._cube[18] = this._cube[15];  //moves 15 to 18
		this._cube[19] = this._cube[13];  //moves 13 to 19
		
		//top to right
		temp3 = this._cube[4];
		temp4 = this._cube[6];
		this._cube[4] = temp;  //moves 18 to 4
		this._cube[6] = temp2; //moves 19 to 6
		
		//right to bottom
		temp = this._cube[21];
		temp2 = this._cube[20];
		this._cube[21] = temp3; //moves 4 to 21
		this._cube[20] = temp4; //moves 6 to 20
		
		//bottom to left
		this._cube[15] = temp;  //moves 21 to 15
		this._cube[13] = temp2; //moves 20 to 13
		
	}
	
	public void moveL(){
		
		Square temp;
		Square temp2;
		Square temp3;
		Square temp4;
		
		//left face
		temp = this._cube[13];
		this._cube[13] = this._cube[12]; //moves 12 to 13
		temp2 = this._cube[15];
		this._cube[15] = temp;  //moves 13 to 15
		temp = this._cube[14];
		this._cube[14] = temp2; //moves 15 to 14
		this._cube[12] = temp;  //moves 14 to 12
		
		//back to top
		temp = this._cube[18];
		temp2 = this._cube[19];
		this._cube[18] = this._cube[11];  //moves 11 to 18
		this._cube[19] = this._cube[9];  //moves 9 to 19
		
		//top to front
		temp3 = this._cube[0];
		temp4 = this._cube[2];
		this._cube[0] = temp;  //moves 18 to 0
		this._cube[2] = temp2; //moves 19 to 2
		
		//front to bottom
		temp = this._cube[21];
		temp2 = this._cube[20];
		this._cube[21] = temp3; //moves 0 to 21
		this._cube[20] = temp4; //moves 2 to 20
		
		//bottom to back
		this._cube[11] = temp;  //moves 21 to 11
		this._cube[9] = temp2; //moves 20 to 9
		
	}

	public void moveU(){
		
		Square temp;
		Square temp2;
		Square temp3;
		Square temp4;
		
		//top face
		temp = this._cube[17];
		this._cube[17] = this._cube[16]; //moves 16 to 17
		temp2 = this._cube[19];
		this._cube[19] = temp;  //moves 17 to 19
		temp = this._cube[18];
		this._cube[18] = temp2; //moves 19 to 18
		this._cube[16] = temp;  //moves 18 to 16
		
		//left to back
		temp = this._cube[10];
		temp2 = this._cube[11];
		this._cube[10] = this._cube[15];  //moves 15 to 10
		this._cube[11] = this._cube[13];  //moves 13 to 11
		
		//back to right
		temp3 = this._cube[4];
		temp4 = this._cube[6];
		this._cube[4] = temp;  //moves 10 to 4
		this._cube[6] = temp2; //moves 11 to 6
		
		//right to front
		temp = this._cube[1];
		temp2 = this._cube[0];
		this._cube[1] = temp3; //moves 4 to 1
		this._cube[0] = temp4; //moves 6 to 0
		
		//bottom to back
		this._cube[15] = temp;  //moves 1 to 15
		this._cube[13] = temp2; //moves 0 to 13
		
	}

}
