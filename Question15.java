
public class Question15 {

	public static void main(String[] args) 
	{
		int a[] = {10,98,96,78,99};
		firstMethod(a);
	}
	public static void  firstMethod(int []a)
	{
		
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
			
		}System.out.println(max);
	}

}
