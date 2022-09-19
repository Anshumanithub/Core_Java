package CollectionFramework_1;

import java.util.Comparator;

public class Assignment implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		if(m1.getFname()==m2.getFname()) {
			return m1.getLname().compareTo(m2.getLname());
	}
		else {
			return m1.getFname().compareTo(m2.getFname());
			
		}
	
	
		
	}

}
