package Cloning;

public class Address {
private String city;
private String state;
private String street;


    public Address() {
	
}


@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}


}
