package Beginning;

import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void star()
	{
		int star=5;
		for(int i=0;i<=5;i++)
		{
		for(int j=0;j<=star;j++)
		{
			System.out.print("*");
			
		}
		System.out.println();
		star--;
		
		}

	}
	
	@Test
	public void testPrimeNumer()
	{
		int number=4;
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
			
		}
		
		if(count==1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println(" number is prime");
		}
	}
}
