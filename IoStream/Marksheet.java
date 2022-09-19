package IoStream;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Marksheet implements Serializable{
	
	public String name = null;
	public int math = 0;
	public int phy = 0;
	public int che = 0;
	private transient int total = 0;
	private transient double percent=0;
	
	public int getTotal() {
		total= math+phy+che;
		
		return total;
	}
	
	public double getPercent() {
		percent= total/3;
		return percent;
	}

	
	
		
	}
	
	
	


