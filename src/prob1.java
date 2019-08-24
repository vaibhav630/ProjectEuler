
public class prob1 {

	public static void main(String[] args) {
		/*Multiples of 3 and 5

		Problem 1
		If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
		The sum of these multiples is 23.

		Find the sum of all the multiples of 3 or 5 below 1000.*/
		int sum=0;
		for (int i=3;i<1000;i++)
		{
			if(i%3==0 || i%5==0){
				sum=sum+i;
				//System.out.println(i);
			}
		}
		System.out.println("Sum of all the multiples of 3 or 5 below 1000 is "+ sum);

	}

}
