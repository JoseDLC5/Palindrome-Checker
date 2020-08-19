package stacks;

public class WellBalanced {

	//data fields
	private Stack<Character> s;
	private String str;
	private static final String OPEN = "(<{[";
	private static final String CLOSE = "(<{[";
	
	WellBalanced(String s){
		this.str = s
	}
	
	//Methods
	public Boolean isWellBalanced() {
		
	}
	
	public static Boolean isOpening(char c) {
		return OPEN.indexOf(c) != -1;
	}
	
	public static Boolean isClosing(char c) {
		return CLOSE.indexOf(c) != -1;
	}
}
