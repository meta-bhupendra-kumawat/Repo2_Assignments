import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class UseEvaluateInfix {

	public static void main(String args[]) throws ScriptException {
		EvaluateInfix ei = new EvaluateInfix();
		String str ="2 * 3 / ( 2 - 1 ) + 5 * 3"; //"( 100 + 200 ) * 79";
		String s = ei.infixToPostfix(str);
		System.out.println(s);
		
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String foo = "400 * 2";
	    System.out.println(engine.eval(foo));
	}
	
}


//https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form