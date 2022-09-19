
public class Question11 {
	public static void main(String[] args) {
		int temp=0, a=7;
		for(int i=2; i<=a-1; i++)
		{
			if(a%i == 0) 
			{
				temp = temp+1;
			}
		}if(temp == 0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
		
	}
	

}


