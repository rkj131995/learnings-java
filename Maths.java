
public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxInt = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		
		long value = -2l;
		System.out.println("add " + 3 + 4);
		
		System.out.println(Math.log10(234));
		
		System.out.println(1==1 || 1<1 && 2==6 || 2<3);
		System.out.println(reverseNum(1424545349));
		


	}
	
	static int reverseNum(int num)
	{
		
		int reverse = 0;
		int prev = 0;
		while(num > 0)
		{
			reverse = reverse * 10 + num % 10;
			
			if((reverse - num%10)/10 == prev)
				prev = reverse;
			else
				return 0;
			
			num /=10;
			
			
			
		}
		
		return reverse;
	}

}
