package Cloning;

public class TestClone {
	public static void main(String[] args) throws Exception {
		
		
		Address a = new Address();
		
		a.setCity("birsinghur");
		a.setState("mp");
		a.setStreet("ward5");
			
		
		Employee r  =new Employee();
		r.setFname("anshu");
		r.setLname("man");
		r.setId(420);
		
		Address a1 = (Address)a.clone();
		Employee r1 = (Employee)r.clone();
		
		
		
		
		System.out.println(a.getCity());
		System.out.println(a.getState());
		System.out.println(a.getStreet());
		
		
		System.out.println(r.getFname());
		System.out.println(r.getLname());
		System.out.println(r.getId());
		
		 
	}
	
	
	

}
