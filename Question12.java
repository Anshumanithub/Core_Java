
public class Question12 {

	public static void main(String[] args) {
		int a=121, rem,rev=0,temp=a;
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(a == rev)
		{
		   System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
		
	}
}
