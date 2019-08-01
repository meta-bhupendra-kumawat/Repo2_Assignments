
public class Stack {
	Node top;
	Node newNode;
	
	public Stack() {
		top = null;
	}
	public boolean push(String element) {
		newNode = new Node();
		
		if(element == null)
			return false;
		
		newNode.data = element;
		newNode.next = null;
		if(top == null)
			top = newNode;
		else{
			newNode.next = top;
			top = newNode;
		}
		return true;
	}
	
	public String pop() {
		if( top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		
		String s = top.data;
		top = top.next;
		return s;
	}
	
	public String peek() {
		if( top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		String topElement = top.data;
		return topElement;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
