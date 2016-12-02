
public enum Move {
	
	F("F"),
	B("B"),
	L("L"),
	R("R"),
	U("U"),
	D("D");
	
	private final String move;
	
	Move(String move) {
        this.move = move;
    }
    
    public String getMove() {
        return this.move;
    }

}
