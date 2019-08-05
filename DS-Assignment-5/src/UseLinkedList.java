
public class UseLinkedList {

	public static void main(String[] args) {
		Employee e;
		
		LinkedList l = new LinkedList();
		l.addNode(new Employee("1", "AAA", 24, 19000));
		l.addNode(new Employee("2", "BBBB", 23, 23000));
		l.addNode(new Employee("3", "CCC", 24, 69000));
		l.addNode(new Employee("4", "DDDD", 55, 91000));
		l.addNode(new Employee("3", "EEEE", 21, 290000));
		
		l.show();
		
		
		System.out.println("\n\n\nSorted>>>>");
		l.sortSalary();
		l.show();
	}

}
