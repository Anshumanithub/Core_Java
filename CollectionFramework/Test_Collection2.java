package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test_Collection2 {
	public static void main(String[] args) {
		
		Set s = new HashSet<>();
		s.add(1);
		s.add(4);
		s.add(2);
		s.add(3);
		s.add(1);
		
		System.out.println(s);
		
		
		Set s1 = new TreeSet<>();
		
		s1.add("aayush");
		s1.add("anshuman");
		s1.add("aman");
		s1.add("abhishek");
		
		System.err.println(s1);
		
		LinkedHashSet s2 = new LinkedHashSet();
		
		s2.add("one");
		s2.add("Two");
		s2.add("Three");
		
		System.out.println("=>"+s2);
		
		Iterator it = s2.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
			
			
		}
		
		
		
		
		
		
		
		
	}

}
