
public class Face {
	
	//properties
	private Square _square;
	private Square _square2;
	private Square _square3;
	private Square _square4;
	private Square[] _facearray;
	
	//constructor
	public Face(Square square, Square square2, Square square3, Square square4){
		
		this._square = square;
		this._square2 = square2;
		this._square3 = square3;
		this._square4 = square4;
		this._facearray[0] = square;
		this._facearray[1] = square2;
		this._facearray[2] = square3;
		this._facearray[3] = square4;
		
	}
	
	public boolean CheckFace(){
		
		if(this._square.getColor() == this._square2.getColor() && this._square.getColor() == this._square3.getColor() && this._square.getColor() == this._square4.getColor()){
			
			return true;
			
		} else { return false; }
		
	}

}
