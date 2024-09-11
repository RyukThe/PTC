package Beginning;

public class Array {

	
	public static void main(String[] args) 
	{
		int [] number=new int[3];
		number[0]=5;
		number[1]=6;
		System.out.println(number.length);
		
		System.out.println(number[0]);
		
		for(int i=0;i<=number.length-1;i++)
		{
			System.out.println(number[i]);
		}
		System.out.println("|||||||||||||||");
		multipleArrays();
	}
	
	
	
	
	
	
	
	
	
	
	public static void multipleArrays()
	{
		int [][] rollNumber= {{12,14,16},{15,3,6}};
		System.out.println(rollNumber.length);
		for(int i=0;i<=rollNumber.length-1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(rollNumber[i][j]);
			}
			System.out.println('|');
		}
		
	}
}
