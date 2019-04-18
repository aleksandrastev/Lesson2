package exercises;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print blastoff". 
 */

public class NASACountdown {
	
	private void countDown()
	{
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}
		System.out.println("blastoff");
	}
	
	public static void main(String[] args) {
		new NASACountdown().countDown();
	}

}
