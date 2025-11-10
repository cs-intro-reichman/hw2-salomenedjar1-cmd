// Demonstrates the Collatz conjecture.
public class Collatz 
{
	public static void main(String args[]) 
	{
	  int num= Integer.parseInt(args[0]); 
	  String mode = args[1];
	  

	  for (int i = 1; i <= num; i++) 
	  {
		int n= i;
		int count= 1;

		if (mode.equals("v")) 
		{ 
            System.out.print(i + " ");
	  		while (n != 1)
	  		{
		
				if (n%2==0)
					n= n/2;
				else
					n= n*3+1;

				System.out.print(n+" ");
				count++;
			}
			 System.out.println("(" + count + ")");
	  	}

		else 
		{
			if (mode.equals("c")) 
			{
				while (n != 1)
	  			{
		
				if (n%2==0)
					n= n/2;
				else
					n= n*3+1;
				}

			}
		}
	  
	  }
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");

	}
}

