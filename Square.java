
public class Square {
	
	//properties
	//private int _position;
	private Color _color;
	
	//constructor
	public Square(char colour) {
		
		//this._position = position;
		if (colour == 'r'){
			this._color = Color.RED;
		}
		else if (colour == 'b'){
			this._color = Color.BLUE;
		}
		else if (colour == 'w'){
			this._color = Color.WHITE;
		}
		else if (colour == 'o'){
			this._color = Color.ORANGE;
		}
		else if (colour == 'y'){
			this._color = Color.YELLOW;
		}
		else if (colour == 'g'){
			this._color = Color.GREEN;
		}
		else {
			System.out.println("An error occured. Color of square could not be assigned.");
		}
		
	}
	
	//getter
	//public int getPosition(){ return this._position; }
	public Color getColor(){ return this._color; }
	
	//setter
	//public void setPosition(int pos){ this._position = pos; }

}
