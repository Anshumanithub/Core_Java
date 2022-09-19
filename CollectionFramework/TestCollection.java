package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestCollection {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		 l.add(12);
		 l.add(14);
		 l.add(11);
		 l.add(4.6);
		 l.add("a");
		 l.add("Rays");
		  
		 //l.clear();
		 
		 System.out.println(l);
		 
		 
		 List a = new LinkedList<>();
		 
		 a.add(11);
		 a.add(13);
		 a.add(10);
		 a.add(5.3);
		 a.add("RaysTech");
		 a.addAll(l);
		 
//		 a.remove(3);
//		 a.removeAll(a);
		 
		 
		  //System.out.println(a.containsAll(l));
		// System.out.println(a.contains(12));
		 
		  System.out.println(a);
		  
		  List b = new Vector<>();
		  
		  b.add(5);
		  b.add(9);
		  b.add(56);
		  b.add(85);
		  
		  
		  Integer i = (71);
		  b.add(i);
		
		  //  b.remove(i);
		  
		  
		  
		  
		  System.out.println(b);
		  
		  System.out.println(b.isEmpty());
		  
		  Stack c = new Stack();
		 
		  
		 c.push(1);
		 c.push(2);
		 c.push(3);
		 c.push(4);
		 
		 
		 
		 
		 
		 System.out.println("stack -> "+c);
		 System.err.println(c.peek());
			
		 System.out.println(c.peek());
		 
		 System.err.println(c.pop());
		 System.out.println(c.pop());
		 
		
		 
		 
		 
		 
		 
		  
		  
		  
	}

}
