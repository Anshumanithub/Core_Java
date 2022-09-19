package CollectionFramework_1;

import java.util.Comparator;

public class SortbyFname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m5) {
		// TODO Auto-generated method stub
		return m1.getFname().compareTo(m5.getFname());
	}
	
	

}
