
public enum Color {
	
	RED("R"),
	BLUE("B"),
	WHITE("W"),
	ORANGE("O"),
	YELLOW("Y"),
	GREEN("G");
	
	private final String color;
	
	Color(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }

}
