
/* This is a component class. It is an implementation of LinkedList data structure.
 * This class consists of methods for creating, rotating & detecting loop in LinkedList.
 * @author Bhupendra
 */
public class LinkedList {

	private Node head;
	private Node newNode;
	
	public boolean addNode(Employee e){
		newNode = new Node();
		newNode.data = e;
		newNode.next = null;
		
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
		return true;		
	}
	
	/* This method splits the list from given l & r positions. The splitted sub-list is rotated by 
	 * n number of positions.
	 * @param l left position to split.
	 * @param r right position to split.
	 * @param n number if shifts
	 * @return true if sub list of list is shifted successfully, false otherwise.
	 */
	public boolean rotateSubList(int l, int r, int n) {
		
		if(l <= 0 || r > this.size() || this.head == null) {
			System.out.println("Left or right position out of bound!!");
			throw new AssertionError("Left or right position out of bound!!");
		}
		int count = 1;
		LinkedList subList = new LinkedList();
		subList.head = this.head;
		Node nodeBeforeL = this.head;			// Storing reference to node before "l" of original list.
		Node nodeAfterR = null;					// Storing reference to node after "r" of original list.
		Node temp = this.head;					// Temporary reference for traversal of linked-list.
		
		while(temp != null && count <= r) {
			if(count == l - 1) {
				nodeBeforeL = temp;
				subList.head = temp.next;
				nodeBeforeL.next = null;
			}
			if(count == r) {
				nodeAfterR = temp.next;
				temp.next = null;
			}
			temp = temp.next;
			count++;
		}
		
		// Roatating sub-list
		subList.rotateList(n);
		
		// Connecting sub-list to original list.
		if(l == 1)
			this.head = subList.head;
		else
			nodeBeforeL.next = subList.head;
		
		temp = subList.head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = nodeAfterR;
		return true;
	}
	
	/* This methods rotates the list elements by given number of positions.
	 * @param n number of shifts.
	 * @return true if list is rotated successfully, false otherwise.
	 */
	public boolean rotateList(int n) {
		if(this.head == null) {
			System.out.println("List has not been initialised!!");
			throw new AssertionError("List has not been initialised!!");
		}
		LinkedList list = this;
		Node temp = list.head;
		Node prev = null;
		int count = 0;

		while(temp.next != null & count < n) {
			while(temp.next != null) {
				prev = temp;
				temp = temp.next;	
			}
			temp.next = list.head;
			list.head = temp;
			prev.next = null;
			count++;
		}
		return true;
	}
	
	// This method prints the linked list.
	public void show() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data.Name + "->" + temp.data.salary);
			temp = temp.next;
		}
	}
	
	/* To method will find out the size of linked-list.
	 * @return size or number of nodes of linked-list.
	 */
	public int size() {
		int count = 1;
		Node temp = this.head;
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	/* This method checks for any loop present in linked-list.
	 * @return true if loop exists, false otherwise.
	 */
	public boolean detectLoop() {
		if(this.head == null) {
			System.out.println("List has not been initialised!!");
			throw new AssertionError("List has not been initialised!!");
		}
		Node slow = this.head;
		Node fast = this.head;
		do{
			slow = slow.next;
			fast = fast.next.next;
		}while(fast != null && slow != fast && fast.next != null);
		if(fast == slow)
			return true;
		
		return false;
	}
	
	/* This method sort (descending) based on their salary, the one having the highest salary will be the 1st and 
	 * the one having the lowest will be the last.
	 * For sorting insertion sort is used.
	 */
	public void sortSalary() {
		Node temp = this.head;
		Node prev = this.head;
		
		while(temp != null) {
			
			Node ref2 = this.head;
			Node prevRef2 = this.head;
			
			while(ref2 != temp && temp.data.salary < ref2.data.salary) {
				prevRef2 = ref2;
				ref2 = ref2.next;
			}
			
			if(ref2 == temp) {
				prev = temp;
				temp = temp.next;
				continue;
			}
			
			System.out.println("temp " + temp);
			if(temp.data.salary == ref2.data.salary) {
				if(ref2.data.age > temp.data.age) {
					prev.next = temp.next;
					temp.next = ref2.next;
					ref2.next = temp;
				} else {
					prev.next = temp.next;
					prevRef2 = temp;
					temp.next = ref2;
				}
				
				if(ref2.next == temp)
					ref2.next = prev.next;
				
				System.out.println("YUPP!!");
				temp = prev;
			}
			
			if(temp.data.salary > ref2.data.salary) {
				prev.next = temp.next;
				temp.next = ref2;
				prevRef2.next = temp;
				temp = prev;						System.out.println("temp salary > ref2s.salary");
			}
			
			
			prev = temp;
			temp = temp.next;
		}
	}
}
