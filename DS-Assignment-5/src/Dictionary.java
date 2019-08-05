import java.util.Map;

public interface Dictionary {

	void add(BSTNode newNode);
	BSTNode delete(BSTNode node,int key);
	boolean sort();
	Map<Integer, String> sorted(int k1, int k2);
}
