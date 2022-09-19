
public class Question14 {

	public static void main(String[] args) {
		int sum_1=0,sum_2=0;
		float f;
		for(int i=0; i<=5; i++) {
			if(i%2 == 0) 
			{
				sum_1 = sum_1+i;
			}
			else if(i%2 != 0)
			{
				sum_2 = sum_2+i;
			}
		}System.out.println("sum of N consecutive even number is : "+sum_1+" and sum of N consecutive odd numbers is : "+sum_2);
		f = (sum_1+sum_2)/2f;
		System.out.println("average of consecutive N odd and even number is : "+ f);
	}
}
