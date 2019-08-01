import javax.script.ScriptEngineManager;

public class EvaluateInfix {
	
	public String infixToPostfix(String expression) {
		Stack stk = new Stack();
		String postfix = "";
		for(int i = 0; i < expression.length(); i ++) {
			
			if(expression.charAt(i) == ' ') {
				postfix = postfix.concat(" ");
				continue;
			}
			if(expression.charAt(i) == ')') {
				while(!stk.peek().equals("(")) {
					postfix = postfix.concat(stk.pop());
				}
				stk.pop();
				continue;
			}
			
			if(expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
				postfix = postfix.concat( expression.charAt(i) + "" );		
				continue;
			}
			
			if(Precedence.precedence.containsKey(expression.charAt(i)+"") || expression.charAt(i) == '(') {
				if(stk.isEmpty() || expression.charAt(i) == '(' || stk.peek().equals("(")) {
					stk.push(expression.charAt(i)+"");
					continue;
				}
				
				if(Precedence.precedence.get(expression.charAt(i)+"") > Precedence.precedence.get(stk.peek()))
					stk.push(expression.charAt(i) + "");
				else{
					while( (!stk.isEmpty()) && Precedence.precedence.get(expression.charAt(i)+"") <= Precedence.precedence.get(stk.peek())) 
						postfix = postfix.concat(stk.pop());
					stk.push(expression.charAt(i) + "");
				}
				continue;
			}
		}
		while(!stk.isEmpty())
			postfix = postfix.concat(" " + stk.pop());
		return postfix;
	}
	
	public int evaluatePostfix(String postfix) {
		
		for( int i = 0; i < postfix.length(); i++ ) {
			
		}
		return 0;
	}
}
