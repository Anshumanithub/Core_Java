package Cloning;

public class Employee implements Cloneable {
private String fname;
private String lname;
private int id ;

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

public Employee() {
	System.err.println("default constracto");
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

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}
