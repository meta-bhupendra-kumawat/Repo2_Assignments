import java.util.HashMap;
import java.util.Map;


public class Precedence {
	
	public static Map<String, Integer> precedence = new HashMap<String, Integer>();
	
	static {
		precedence.put("(", -11);
		precedence.put("=", 1);
		precedence.put("!=", 8);
		precedence.put("<", 9);
		precedence.put(">", 9);
		precedence.put("<=", 9);
		precedence.put(">=", 9);
		precedence.put("+", 11);
		precedence.put("-", 11);
		precedence.put("*", 12);
		precedence.put("/", 12);
		precedence.put("%", 12);
		precedence.put("&&", 4);
		precedence.put("||", 3);
		precedence.put("!", 14);
		}

}
