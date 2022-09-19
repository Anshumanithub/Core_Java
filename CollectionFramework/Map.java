package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put(0, 1);
		m.put(1, 2);
		m.put(2, 3);
		m.put(3, 4);
		m.put(4, 5);
		
		
		System.err.println("<->"+m);
		
		TreeMap n = new TreeMap<>();
		
		n.put(0, "one");
		n.put(1, "Two");
		n.put(2, "Three");
		n.put(3, "Four");
		n.put(4, "Five");
		
		//n.remove(1);
		
		
		System.out.println("<=>"+ n);
		System.out.println(n.get(2));
		
		Hashtable x = new Hashtable<>();
		
		x.put(1, "anshuman");
		x.put(2, "pandey");
		x.put(3, "birsinghpur");
		
		System.err.println(x);
		
//		Iterator it = x.iterator();
//		while (it.hasNext()) {
//			String st = (String) it.next();
//			System.err.println(st);
//			
//			
//		}
					
	}

}
