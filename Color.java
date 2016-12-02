
public enum Color {
	
	RED("RED"),
	BLUE("BLUE"),
	WHITE("WHITE"),
	ORANGE("ORANGE"),
	YELLOW("YELLOW"),
	GREEN("GREEN");
	
	private final String color;
	
	Color(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }

}
