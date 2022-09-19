package CollectionFramework_1;

public class Marksheet implements Comparable<Marksheet>{
	
	private String rollno;
	private String fname;
	private String lname;
	private int che;
	private int mat;
	private int phy;
	
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	
	@Override
	public int compareTo(Marksheet m) {
		return this.rollno.compareTo(m.rollno);
		
		
		
	}
	
	
	
	
	
}


