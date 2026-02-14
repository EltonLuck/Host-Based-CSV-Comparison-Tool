import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



class ListToMap
{
	
	HashMap<String, String> InitialConverter(List<List<String>> initialList, int index) {
	    HashMap<String, String> items = new HashMap<>();
	    for (int i = 0; i < initialList.size(); i++) {
		    items.put(initialList.get(i).get(index), "-");
		}
	    return items;
	}
	
	ArrayList<String> SecondConverter(List<List<String>> secondList, int index) {
	    ArrayList<String> items = new ArrayList<String> ();
	    for (int i = 0; i < secondList.size(); i++) {
		    items.add(secondList.get(i).get(index));
		}
	    return items;
	}
	
	int Headers(List<String> headerIndex) {
	   int c = 0;
	   while(!(headerIndex.get(c).toLowerCase().contains("name"))) {
			c++;
	   }
	    return c;
	}
	
	void Result(List<List<String>> firstFileList, List<List<String>> secondFileList, List<String> firstFileHeaders, List<String> secondFileHeaders) {
	    int headerValue1 = Headers(firstFileHeaders);
	    int headerValue2 = Headers(secondFileHeaders);
	    
	    HashMap<String, String> firstFileItems = InitialConverter(firstFileList, headerValue1);
	    ArrayList<String> secondFileItems = SecondConverter(secondFileList, headerValue2);

		System.out.println("Mismatched Record Names:\n");
	    
	    for(int x = 0; x < secondFileItems.size(); x++) {
	        if(!firstFileItems.containsKey(secondFileItems.get(x))) {
	            System.out.print(secondFileItems.get(x) + "\n");
	        }
	    
	    }
	}
	
}