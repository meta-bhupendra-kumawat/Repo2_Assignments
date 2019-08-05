import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 

public class GetJSON {
	
	public List<BSTNode> getJSON() throws Exception {
		
		BSTNode treeNode;
		List<BSTNode> BSTList = new ArrayList<BSTNode>(); 
		
		try {
			Object obj = new JSONParser().parse(new FileReader("C:\\Users\\bhupe\\Desktop\\d\\Data.json"));
			JSONObject jo = (JSONObject) obj;
			
			JSONArray jArray = (JSONArray) jo.get("dictionary");
			
			Iterator<Map.Entry> iter;
			Iterator iter2 = jArray.iterator();
			
			while(iter2.hasNext()) {
				iter = ((Map)iter2.next()).entrySet().iterator();
				while(iter.hasNext()) {
					Map.Entry pair = iter.next();
//					System.out.println(pair.getKey()+" "+pair.getValue());
//					bTree.add(Integer.parseInt((String)pair.getKey()), (String)pair.getValue());	
					treeNode = new BSTNode();
					treeNode.key = Integer.parseInt((String)pair.getKey());
					treeNode.value = (String) pair.getValue();
					BSTList.add(treeNode);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();			
		}
		return BSTList;
	}
}
