import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;



public class ArrayListIterate {
	 */

	public static void main(String[] args) {
		/*ArrayList<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		ListIterator<String> i = a.listIterator();
		while (i.hasNext()) {
			a.add("4");
		}
		System.out.println(a);*/
		
		/*HashMap<String, ArrayList<ArrayList<String>>> hMap = new HashMap<String, ArrayList<ArrayList<String>>>();
		
		ArrayList<String> arryList = new ArrayList<String>();
		ArrayList<ArrayList<String>> arryList1 = new ArrayList<ArrayList<String>>();
		
		ArrayList<ArrayList<String>> strArryList = new ArrayList<ArrayList<String>>();
		
		arryList.add("Test");
		arryList.add("Test1");
		arryList.add("Test2");
		arryList.add("Test3");
		
		strArryList.add(arryList);
		
		hMap.put("Hi", strArryList);
		
		arryList1 = hMap.get("Hi");
		
//		System.out.println(arryList1.get(0).get(0));
		
		System.out.println(arryList.contains("Tes"));*/
		
		/*double totalCr = 1.0;
		
		String total = "1.5";
		
		totalCr += Double.parseDouble(total);
		
		System.out.println(totalCr);*/
		
		/*ArrayList<ArrayList<String>> st = new ArrayList<ArrayList<String>>();
		st.add(arryList);*/
		
		
		HashMap<String, HashMap<String, String>> hMap1 = new HashMap<String, HashMap<String,String>>();
		HashMap<String, String> hMap2 = new HashMap<String, String>();
		
		
		hMap2.put("MP_PATIENT", "hm_MP_PATIENT");
		hMap2.put("MP_PATIENT2", "hm_MP_PATIENT2");
		
		
		hMap1.put("MP_PATIENT1", hMap2);
		System.out.println("1: "+hMap1.get("MP_PATIENT1"));
		System.out.println("2: "+hMap1.get("MP_PATIENT1").get("MP_PATIENT"));
	}

}
