package CollectionFramework_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test_Marksheet   {

	public static void main(String[] args) {
	
		Marksheet m1 = new Marksheet();
		m1.setRollno("1");
		m1.setFname("Prashant");
		m1.setLname("Gautam");
	    m1.setPhy(85);
	    m1.setMat(90);
	    m1.setChe(95);
	    
	    Marksheet m2 = new Marksheet();
	    m2.setRollno("2");
	    m2.setFname("Nikki");
	    m2.setLname("Gautam");
	    m2.setChe(25);
	    m2.setMat(36);
	    m2.setPhy(48);
	    
	    Marksheet m3 = new Marksheet();
	    m3.setRollno("3");
	    m3.setFname("Suraj");
	    m3.setLname("sharma");
	    m3.setMat(45);
	    m3.setPhy(25);
	    m3.setChe(31);
	    
	    Marksheet m4 = new Marksheet();
	    m4.setRollno("4");
	    m4.setFname("ajay");
	    m4.setLname("Gupta");
	    m4.setMat(32);
	    m4.setPhy(27);
	    m4.setChe(34);
	    
	    Marksheet m5 = new Marksheet();
	    m5.setRollno("5");
	    m5.setFname("Ajay");
	    m5.setLname("Keshrwani");
	    m5.setMat(49);
	    m5.setPhy(51);
	    m5.setChe(62);
	    
	    
	    ArrayList a = new ArrayList();
	     a.add(m1);
	     a.add(m2);
	     a.add(m3);
	     a.add(m4);
	     a.add(m5);
	     
	     
	  //   Collections.sort(a,new SortbyFname());
	    // Collections.sort(a,new SortbyLname());
	     Collections.sort(a,new Assignment());
	     
	    
	     Iterator i = a.iterator();
	     
	     while (i.hasNext()) {
	    	 Marksheet m = (Marksheet) i.next();
	    	 System.out.println(m.getRollno()+" "+m.getFname()+" "+m.getLname()+" "+m.getChe()+" "+m.getMat()+" "+m.getPhy());
	    	 
	     }
	     
	     
	     
	    
	     
	    
	    
	    
	    
		
				
  }
}
